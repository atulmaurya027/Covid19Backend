package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CountsData {

    @SerializedName("total_confirmed")
    @Expose
    private String totalConfirmed;
    @SerializedName("total_recovered")
    @Expose
    private String totalRecovered;
    @SerializedName("total_deaths")
    @Expose
    private String totalDeaths;
    @SerializedName("total_active")
    @Expose
    private String totalActive;
    @SerializedName("today_confirmed")
    @Expose
    private String todayConfirmed;
    @SerializedName("today_recovered")
    @Expose
    private String todayRecovered;
    @SerializedName("today_deaths")
    @Expose
    private String todayDeaths;

    /**
     * No args constructor for use in serialization
     *
     */
    public CountsData() {
    }

    /**
     *
     * @param totalDeaths
     * @param todayRecovered
     * @param totalActive
     * @param todayConfirmed
     * @param totalRecovered
     * @param totalConfirmed
     * @param todayDeaths
     */
    public CountsData(String totalConfirmed, String totalRecovered, String totalDeaths, String totalActive, String todayConfirmed, String todayRecovered, String todayDeaths) {
        super();
        this.totalConfirmed = totalConfirmed;
        this.totalRecovered = totalRecovered;
        this.totalDeaths = totalDeaths;
        this.totalActive = totalActive;
        this.todayConfirmed = todayConfirmed;
        this.todayRecovered = todayRecovered;
        this.todayDeaths = todayDeaths;
    }

    public String getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(String totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public String getTotalActive() {
        return totalActive;
    }

    public void setTotalActive(String totalActive) {
        this.totalActive = totalActive;
    }

    public String getTodayConfirmed() {
        return todayConfirmed;
    }

    public void setTodayConfirmed(String todayConfirmed) {
        this.todayConfirmed = todayConfirmed;
    }

    public String getTodayRecovered() {
        return todayRecovered;
    }

    public void setTodayRecovered(String todayRecovered) {
        this.todayRecovered = todayRecovered;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalConfirmed", totalConfirmed).append("totalRecovered", totalRecovered).append("totalDeaths", totalDeaths).append("totalActive", totalActive).append("todayConfirmed", todayConfirmed).append("todayRecovered", todayRecovered).append("todayDeaths", todayDeaths).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalDeaths).append(todayRecovered).append(totalActive).append(todayConfirmed).append(totalRecovered).append(totalConfirmed).append(todayDeaths).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CountsData) == false) {
            return false;
        }
        CountsData rhs = ((CountsData) other);
        return new EqualsBuilder().append(totalDeaths, rhs.totalDeaths).append(todayRecovered, rhs.todayRecovered).append(totalActive, rhs.totalActive).append(todayConfirmed, rhs.todayConfirmed).append(totalRecovered, rhs.totalRecovered).append(totalConfirmed, rhs.totalConfirmed).append(todayDeaths, rhs.todayDeaths).isEquals();
    }

}