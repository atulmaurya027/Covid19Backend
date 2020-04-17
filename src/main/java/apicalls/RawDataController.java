package apicalls;

import com.google.gson.Gson;
import datasource.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import responses.*;
import responses.Statewise;

import javax.annotation.Resource;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Controller
public class RawDataController {

    @Resource
    ApplicationContext context;

    @Resource
    HttpClient httpClient;
    private static int todayPatients = 0;

    private final String API_SERVER = "https://api.covid19india.org/";

    Map<String, Integer> statewisePatients = new LinkedHashMap<>();
    Map<String, Integer> districtWisePatients = new LinkedHashMap<>();

    @ResponseBody
    @RequestMapping(value = "/rawdata", method = RequestMethod.GET)
    public int rawData()
    {
        RawData outputListRawData = new RawData();
        List<State> states = new ArrayList<State>();
        List<DistrictData> districtDataList = new LinkedList<DistrictData>();
        List<PatientStatus> patientStatusList = new LinkedList<PatientStatus>();
        PatientStatusWrapper patientStatusWrapper = new PatientStatusWrapper();
        Gson gson = new Gson();
        int patientCount = 0;
        int deltaToday = 0;
        //String httpPutURIRawData = API_SERVER + "raw_data.json";
        String httpPutURIStateDistrict = API_SERVER + "v2/state_district_wise.json";
        String httpPutURIPatientStatus = API_SERVER + "deaths_recoveries.json";
        String httpPutURIDailyConfirmed = API_SERVER + "states_daily_csv/confirmed.csv";
        String httpPutURIDailyRecovered = API_SERVER + "states_daily_csv/recovered.csv";
        String httpPutURIDailyDied = API_SERVER + "states_daily_csv/deceased.csv";
        //HttpGet requestRawData = new HttpGet(httpPutURIRawData);
        HttpGet requestStateDistrict = new HttpGet(httpPutURIStateDistrict);
        HttpGet requestPatientStatus = new HttpGet(httpPutURIPatientStatus);
        HttpGet requestDailyConfirmed= new HttpGet(httpPutURIDailyConfirmed);
        HttpGet requestDailyRecovered = new HttpGet(httpPutURIDailyRecovered);
        HttpGet requestDailyDied = new HttpGet(httpPutURIDailyDied);
        try {
            //HttpResponse responseRawData = httpClient.execute(requestRawData);
            //String responseBodyRawData = EntityUtils.toString(responseRawData.getEntity());
            //outputListRawData = (RawData) gson.fromJson(responseBodyRawData, RawData.class);
//            TreeSet<Integer> count = new TreeSet<Integer>();
//            for (RawDatum rd : outputListRawData.getRawData())
//            {
//                if (rd.getPatientnumber() != null || !rd.getPatientnumber().isEmpty())
//                    count.add(Integer.valueOf(rd.getPatientnumber()));
//            }
//            patientCount = count.last();

            //Use this for total, statewise and districtwise count, total recovered and total died
            HttpResponse responseStateDistrict = httpClient.execute(requestStateDistrict);
            String responseBodyStateDistrict = EntityUtils.toString(responseStateDistrict.getEntity());
            states = (List<State>) gson.fromJson(responseBodyStateDistrict, ArrayList.class);
            for (int i = 0; i < states.size(); i++)
            {
                int statewiseCount = 0;
                State state = gson.fromJson(gson.toJson(states.get(i)), State.class);
                for (DistrictData dd : state.getDistrictData())
                {
                    //totalPatients = totalPatients + dd.getConfirmed();
                    districtWisePatients.put(dd.getDistrict(), dd.getConfirmed());
                    statewiseCount = statewiseCount + dd.getConfirmed();
                }
                statewisePatients.put(state.getState(), statewiseCount);
            }

            HttpResponse responsePatientStatus = httpClient.execute(requestPatientStatus);
            String responseBodyPatientStatus = EntityUtils.toString(responsePatientStatus.getEntity());
            patientStatusWrapper = gson.fromJson(responseBodyPatientStatus, PatientStatusWrapper.class);

            for (PatientStatus patientStatus : patientStatusWrapper.getDeathsRecoveries())
            {
                //if (patientStatus.getDeceased() != null &&patientStatus.getDeceased().equalsIgnoreCase("Recovered"))
                    //totalRecovered = totalRecovered + 1;
               // else if (patientStatus.getDeceased() != null &&patientStatus.getDeceased().equalsIgnoreCase("Deceased"))
                    //totalDied = totalDied + 1;
            }

            //totalActivePatients = totalPatients - totalRecovered - totalDied;

            //End of //Use this for total, statewise and districtwise count, total recovered and total died


            // Daily confirmed, recovered and died- by state

            HttpResponse responseDailyConfirmed = httpClient.execute(requestDailyConfirmed);
            String responseBodyDailyConfirmed = EntityUtils.toString(responseDailyConfirmed.getEntity());
            String[] dailyPatients = responseBodyDailyConfirmed.substring(responseBodyDailyConfirmed.lastIndexOf("\n") + 1).split(",");
            //todayPatients = todayPatients + Integer.valueOf(dailyPatients[1]);

            HttpResponse responseDailyRecovered = httpClient.execute(requestDailyRecovered);
            String responseBodyDailyRecovered = EntityUtils.toString(responseDailyRecovered.getEntity());
            String[] dailyRecovered = responseBodyDailyRecovered.substring(responseBodyDailyRecovered.lastIndexOf("\n") + 1).split(",");
            //todayRecovered = todayRecovered + Integer.valueOf(dailyRecovered[1]);

            HttpResponse responseDailyDied = httpClient.execute(requestDailyDied);
            String responseBodyDailyDied = EntityUtils.toString(responseDailyDied.getEntity());
            String[] dailyDied = responseBodyDailyDied.substring(responseBodyDailyDied.lastIndexOf("\n") + 1).split(",");
            //todayDied = todayDied + Integer.valueOf(dailyDied[1]);
         } catch (IOException e) {
            e.printStackTrace();
        }


        return 0;
        //return deltaToday;
    }

    @ResponseBody
    @RequestMapping(value = "/getcount", method = RequestMethod.GET)
    public CountsData getCount()
    {
        int totalPatients = 0;
        int totalActivePatients = 0;
        int totalRecovered = 0;
        int totalDied = 0;
        int todayRecoveredd = 0;
        int todayDied = 0;
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        String day = DateTimeFormatter.ofPattern("dd/MM/YYYY").format(now);
        String day1 = DateTimeFormatter.ofPattern("dd-MMM-YY").format(now);

        CountsData countsData = new CountsData();
        RawData outputListRawData = new RawData();
        List<State> states = new ArrayList<State>();
        List<StatesHistory> statesHistoryList = new ArrayList<StatesHistory>();
        StatesHistoryWrapper statesHistoryWrapper = null;
        List<DistrictData> districtDataList = new LinkedList<DistrictData>();
        List<PatientStatus> patientStatusList = new LinkedList<PatientStatus>();
        PatientStatusWrapper patientStatusWrapper = new PatientStatusWrapper();
        Gson gson = new Gson();
        int patientCount = 0;
        int deltaToday = 0;
        String httpPutURIStateDistrict = API_SERVER + "v2/state_district_wise.json";
        String httpPutURIPatientStatus = API_SERVER + "deaths_recoveries.json";
//        String httpPutURIDailyConfirmed = API_SERVER + "states_daily_csv/confirmed.csv";
//        String httpPutURIDailyRecovered = API_SERVER + "states_daily_csv/recovered.csv";
//        String httpPutURIDailyDied = API_SERVER + "states_daily_csv/deceased.csv";
        String httpPutURIDailyChanges = API_SERVER + "states_daily.json";
        HttpGet requestStateDistrict = new HttpGet(httpPutURIStateDistrict);
        HttpGet requestPatientStatus = new HttpGet(httpPutURIPatientStatus);
        HttpGet requestDailyChanges= new HttpGet(httpPutURIDailyChanges);
//        HttpGet requestDailyRecovered = new HttpGet(httpPutURIDailyRecovered);
//        HttpGet requestDailyDied = new HttpGet(httpPutURIDailyDied);
        try {

            //Use this for total, statewise and districtwise count, total recovered and total died
            HttpResponse responseStateDistrict = httpClient.execute(requestStateDistrict);
            String responseBodyStateDistrict = EntityUtils.toString(responseStateDistrict.getEntity());
            states = (List<State>) gson.fromJson(responseBodyStateDistrict, ArrayList.class);
            for (int i = 0; i < states.size(); i++)
            {
                int statewiseCount = 0;
                State state = gson.fromJson(gson.toJson(states.get(i)), State.class);
                for (DistrictData dd : state.getDistrictData())
                {
                    totalPatients = totalPatients + dd.getConfirmed();
                    districtWisePatients.put(dd.getDistrict(), dd.getConfirmed());
                    statewiseCount = statewiseCount + dd.getConfirmed();
                }
                statewisePatients.put(state.getState(), statewiseCount);
            }
            HttpResponse responsePatientStatus = httpClient.execute(requestPatientStatus);
            String responseBodyPatientStatus = EntityUtils.toString(responsePatientStatus.getEntity());
            patientStatusWrapper = gson.fromJson(responseBodyPatientStatus, PatientStatusWrapper.class);

            for (PatientStatus patientStatus : patientStatusWrapper.getDeathsRecoveries())
            {
                if (patientStatus.getDeceased() != null && patientStatus.getDeceased().equalsIgnoreCase("Recovered"))
                    totalRecovered = totalRecovered + 1;
                else if (patientStatus.getDeceased() != null && patientStatus.getDeceased().equalsIgnoreCase("Deceased"))
                    totalDied = totalDied + 1;
                if (patientStatus.getDeceased() != null && patientStatus.getDeceased().equalsIgnoreCase("Recovered") && day.equalsIgnoreCase(patientStatus.getDate()))
                {
                    todayRecoveredd = todayRecoveredd + 1;
                }
                else if (patientStatus.getDeceased() != null && patientStatus.getDeceased().equalsIgnoreCase("Deceased") && day.equalsIgnoreCase(patientStatus.getDate()))
                    todayDied = todayDied + 1;
            }

            totalActivePatients = totalPatients - totalRecovered - totalDied;


            // TODO To check tomorrow
            todayPatients = 0;
            HttpResponse responseStateDailyChanges = httpClient.execute(requestDailyChanges);
            String responseBodyStateDailyChanges = EntityUtils.toString(responseStateDailyChanges.getEntity());
            statesHistoryWrapper = gson.fromJson(responseBodyStateDailyChanges, StatesHistoryWrapper.class);
            for (StatesHistory statesHistory : statesHistoryWrapper.getStatesHistory())
            {
                int statewiseCountConfirmed = 0;
                int statewiseCountDied = 0;
                int statewiseCountRecovered = 0;
                //StatesHistory statesHistory = gson.fromJson(gson.toJson(statesHistoryList.get(i)), StatesHistory.class);
                if(statesHistory.getDate().equalsIgnoreCase(day1) && statesHistory.getStatus().equalsIgnoreCase("Confirmed"))
                {
                    todayPatients = sumState(todayPatients, statesHistory);
                }
            }

            //End of //Use this for total, statewise and districtwise count, total recovered and total died


            // Daily confirmed, recovered and died- by state

//            HttpResponse responseDailyConfirmed = httpClient.execute(requestDailyConfirmed);
//            String responseBodyDailyConfirmed = EntityUtils.toString(responseDailyConfirmed.getEntity());
//            String[] dailyPatients = responseBodyDailyConfirmed.substring(responseBodyDailyConfirmed.lastIndexOf("\n") + 1).split(",");
//            todayPatients = todayPatients + Integer.valueOf(dailyPatients[1]);
//
//            HttpResponse responseDailyRecovered = httpClient.execute(requestDailyRecovered);
//            String responseBodyDailyRecovered = EntityUtils.toString(responseDailyRecovered.getEntity());
//            String[] dailyRecovered = responseBodyDailyRecovered.substring(responseBodyDailyRecovered.lastIndexOf("\n") + 1).split(",");
//            todayRecovered = todayRecovered + Integer.valueOf(dailyRecovered[1]);
//
//            HttpResponse responseDailyDied = httpClient.execute(requestDailyDied);
//            String responseBodyDailyDied = EntityUtils.toString(responseDailyDied.getEntity());
//            String[] dailyDied = responseBodyDailyDied.substring(responseBodyDailyDied.lastIndexOf("\n") + 1).split(",");
//            todayDied = todayDied + Integer.valueOf(dailyDied[1]);

            countsData.setTodayConfirmed(String.valueOf(todayPatients));
            countsData.setTodayDeaths(String.valueOf(todayDied));
            countsData.setTodayRecovered(String.valueOf(todayRecoveredd));
            countsData.setTotalConfirmed(String.valueOf(totalPatients));
            countsData.setTotalDeaths(String.valueOf(totalDied));
            countsData.setTotalRecovered(String.valueOf(totalRecovered));
            countsData.setTotalActive(String.valueOf(totalActivePatients));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countsData;
    }

    @ResponseBody
    @RequestMapping(value = "/statecount", method = RequestMethod.GET)
    public StatewiseData getCountByState()
    {
        StatewiseData statewiseData = new StatewiseData();
        Statewise statewise = null;
        List<State> states = new ArrayList<State>();
        List<Statewise> statewiseList = new LinkedList<>();
        Gson gson = new Gson();
        String httpPutURIStateDistrict = API_SERVER + "v2/state_district_wise.json";
        HttpGet requestStateDistrict = new HttpGet(httpPutURIStateDistrict);
        Map<String, Integer> stateDeltaMap = new LinkedHashMap<>();

        try {
            HttpResponse responseStateDistrict = httpClient.execute(requestStateDistrict);
            String responseBodyStateDistrict = EntityUtils.toString(responseStateDistrict.getEntity());
            states = (List<State>) gson.fromJson(responseBodyStateDistrict, ArrayList.class);
            int deltaCount = 0;
            for (int i = 0; i < states.size(); i++)
            {
                statewise = new Statewise();
                int statewiseCount = 0;
                int stateDeltaCount = 0;
                State state = gson.fromJson(gson.toJson(states.get(i)), State.class);
                statewise.setState(state.getState());
                for (DistrictData dd : state.getDistrictData())
                {
                    statewiseCount = statewiseCount + dd.getConfirmed();
                    stateDeltaCount = dd.getDelta().getConfirmed() + stateDeltaCount;
                }
                statewise.setTotalConfirmed(String.valueOf(statewiseCount) + " C");
                statewiseList.add(statewise);
                stateDeltaMap.put(state.getState(), stateDeltaCount);
                deltaCount = deltaCount + stateDeltaCount;
            }
            todayPatients = deltaCount;
            statewiseData.setStatewise(statewiseList);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return statewiseData;
    }

    private int sumState(int sum, StatesHistory statesHistory)
    {
        if (statesHistory.getAn() != null && statesHistory.getAn().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getAn());
        if (statesHistory.getAp() != null && statesHistory.getAp().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getAp());
        if (statesHistory.getAr() != null && statesHistory.getAr().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getAr());
        if (statesHistory.getAs() != null && statesHistory.getAs().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getAs());
        if (statesHistory.getBr() != null && statesHistory.getBr().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getBr());
        if (statesHistory.getCh() != null && statesHistory.getCh().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getCh());
        if (statesHistory.getCt() != null && statesHistory.getCt().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getCt());
        if (statesHistory.getBr() != null && statesHistory.getBr().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getBr());
        if (statesHistory.getDd() != null && statesHistory.getDd().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getDd());
        if (statesHistory.getDl() != null && statesHistory.getDl().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getDl());
        if (statesHistory.getDn() != null && statesHistory.getDn().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getDn());
        if (statesHistory.getGa() != null && statesHistory.getGa().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getGa());
        if (statesHistory.getGj() != null && statesHistory.getGj().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getGj());
        if (statesHistory.getHp() != null && statesHistory.getHp().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getHp());
        if (statesHistory.getHr() != null && statesHistory.getHr().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getHr());
        if (statesHistory.getJh() != null && statesHistory.getJh().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getJh());
        if (statesHistory.getBr() != null && statesHistory.getBr().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getBr());
        if (statesHistory.getJk() != null && statesHistory.getJk().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getJk());
        if (statesHistory.getLa() != null && statesHistory.getLa().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getLa());
        if (statesHistory.getLd() != null && statesHistory.getLd().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getLd());
        if (statesHistory.getMh() != null && statesHistory.getMh().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getMh());
        if (statesHistory.getMl() != null && statesHistory.getMl().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getMl());
        if (statesHistory.getMn() != null && statesHistory.getMn().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getMn());
        if (statesHistory.getMp() != null && statesHistory.getMp().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getMp());
        if (statesHistory.getMz() != null && statesHistory.getMz().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getMz());
        if (statesHistory.getNl() != null && statesHistory.getNl().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getNl());
        if (statesHistory.getOr() != null && statesHistory.getOr().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getOr());
        if (statesHistory.getPb() != null && statesHistory.getPb().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getPb());
        if (statesHistory.getPy() != null && statesHistory.getPy().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getPy());
        if (statesHistory.getRj() != null && statesHistory.getRj().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getRj());
        if (statesHistory.getSk() != null && statesHistory.getSk().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getSk());
        if (statesHistory.getTg() != null && statesHistory.getTg().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getTg());
        if (statesHistory.getTn() != null && statesHistory.getTn().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getTn());
        if (statesHistory.getTr() != null && statesHistory.getTr().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getTr());
        if (statesHistory.getTt() != null && statesHistory.getTt().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getTt());
        if (statesHistory.getUp() != null && statesHistory.getUp().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getUp());
        if (statesHistory.getUt() != null && statesHistory.getUt().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getUt());
        if (statesHistory.getWb() != null && statesHistory.getWb().length() > 0)
            sum = sum + Integer.valueOf(statesHistory.getWb());
        return sum;
    }
}
