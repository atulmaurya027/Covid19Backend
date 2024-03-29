package datasource;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RawDatum {

    @SerializedName("agebracket")
    @Expose
    private String agebracket;
    @SerializedName("backupnotes")
    @Expose
    private String backupnotes;
    @SerializedName("contractedfromwhichpatientsuspected")
    @Expose
    private String contractedfromwhichpatientsuspected;
    @SerializedName("currentstatus")
    @Expose
    private String currentstatus;
    @SerializedName("dateannounced")
    @Expose
    private String dateannounced;
    @SerializedName("detectedcity")
    @Expose
    private String detectedcity;
    @SerializedName("detecteddistrict")
    @Expose
    private String detecteddistrict;
    @SerializedName("detectedstate")
    @Expose
    private String detectedstate;
    @SerializedName("estimatedonsetdate")
    @Expose
    private String estimatedonsetdate;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("patientnumber")
    @Expose
    private String patientnumber;
    @SerializedName("source1")
    @Expose
    private String source1;
    @SerializedName("source2")
    @Expose
    private String source2;
    @SerializedName("source3")
    @Expose
    private String source3;
    @SerializedName("statecode")
    @Expose
    private String statecode;
    @SerializedName("statepatientnumber")
    @Expose
    private String statepatientnumber;
    @SerializedName("statuschangedate")
    @Expose
    private String statuschangedate;
    @SerializedName("typeoftransmission")
    @Expose
    private String typeoftransmission;

    /**
     * No args constructor for use in serialization
     *
     */
    public RawDatum() {
    }

    /**
     *
     * @param patientnumber
     * @param currentstatus
     * @param estimatedonsetdate
     * @param notes
     * @param gender
     * @param source3
     * @param typeoftransmission
     * @param agebracket
     * @param source1
     * @param source2
     * @param detectedstate
     * @param statecode
     * @param statuschangedate
     * @param dateannounced
     * @param detecteddistrict
     * @param backupnotes
     * @param nationality
     * @param contractedfromwhichpatientsuspected
     * @param detectedcity
     * @param statepatientnumber
     */
    public RawDatum(String agebracket, String backupnotes, String contractedfromwhichpatientsuspected, String currentstatus, String dateannounced, String detectedcity, String detecteddistrict, String detectedstate, String estimatedonsetdate, String gender, String nationality, String notes, String patientnumber, String source1, String source2, String source3, String statecode, String statepatientnumber, String statuschangedate, String typeoftransmission) {
        super();
        this.agebracket = agebracket;
        this.backupnotes = backupnotes;
        this.contractedfromwhichpatientsuspected = contractedfromwhichpatientsuspected;
        this.currentstatus = currentstatus;
        this.dateannounced = dateannounced;
        this.detectedcity = detectedcity;
        this.detecteddistrict = detecteddistrict;
        this.detectedstate = detectedstate;
        this.estimatedonsetdate = estimatedonsetdate;
        this.gender = gender;
        this.nationality = nationality;
        this.notes = notes;
        this.patientnumber = patientnumber;
        this.source1 = source1;
        this.source2 = source2;
        this.source3 = source3;
        this.statecode = statecode;
        this.statepatientnumber = statepatientnumber;
        this.statuschangedate = statuschangedate;
        this.typeoftransmission = typeoftransmission;
    }

    public String getAgebracket() {
        return agebracket;
    }

    public void setAgebracket(String agebracket) {
        this.agebracket = agebracket;
    }

    public String getBackupnotes() {
        return backupnotes;
    }

    public void setBackupnotes(String backupnotes) {
        this.backupnotes = backupnotes;
    }

    public String getContractedfromwhichpatientsuspected() {
        return contractedfromwhichpatientsuspected;
    }

    public void setContractedfromwhichpatientsuspected(String contractedfromwhichpatientsuspected) {
        this.contractedfromwhichpatientsuspected = contractedfromwhichpatientsuspected;
    }

    public String getCurrentstatus() {
        return currentstatus;
    }

    public void setCurrentstatus(String currentstatus) {
        this.currentstatus = currentstatus;
    }

    public String getDateannounced() {
        return dateannounced;
    }

    public void setDateannounced(String dateannounced) {
        this.dateannounced = dateannounced;
    }

    public String getDetectedcity() {
        return detectedcity;
    }

    public void setDetectedcity(String detectedcity) {
        this.detectedcity = detectedcity;
    }

    public String getDetecteddistrict() {
        return detecteddistrict;
    }

    public void setDetecteddistrict(String detecteddistrict) {
        this.detecteddistrict = detecteddistrict;
    }

    public String getDetectedstate() {
        return detectedstate;
    }

    public void setDetectedstate(String detectedstate) {
        this.detectedstate = detectedstate;
    }

    public String getEstimatedonsetdate() {
        return estimatedonsetdate;
    }

    public void setEstimatedonsetdate(String estimatedonsetdate) {
        this.estimatedonsetdate = estimatedonsetdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPatientnumber() {
        return patientnumber;
    }

    public void setPatientnumber(String patientnumber) {
        this.patientnumber = patientnumber;
    }

    public String getSource1() {
        return source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    public String getSource2() {
        return source2;
    }

    public void setSource2(String source2) {
        this.source2 = source2;
    }

    public String getSource3() {
        return source3;
    }

    public void setSource3(String source3) {
        this.source3 = source3;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getStatepatientnumber() {
        return statepatientnumber;
    }

    public void setStatepatientnumber(String statepatientnumber) {
        this.statepatientnumber = statepatientnumber;
    }

    public String getStatuschangedate() {
        return statuschangedate;
    }

    public void setStatuschangedate(String statuschangedate) {
        this.statuschangedate = statuschangedate;
    }

    public String getTypeoftransmission() {
        return typeoftransmission;
    }

    public void setTypeoftransmission(String typeoftransmission) {
        this.typeoftransmission = typeoftransmission;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("agebracket", agebracket).append("backupnotes", backupnotes).append("contractedfromwhichpatientsuspected", contractedfromwhichpatientsuspected).append("currentstatus", currentstatus).append("dateannounced", dateannounced).append("detectedcity", detectedcity).append("detecteddistrict", detecteddistrict).append("detectedstate", detectedstate).append("estimatedonsetdate", estimatedonsetdate).append("gender", gender).append("nationality", nationality).append("notes", notes).append("patientnumber", patientnumber).append("source1", source1).append("source2", source2).append("source3", source3).append("statecode", statecode).append("statepatientnumber", statepatientnumber).append("statuschangedate", statuschangedate).append("typeoftransmission", typeoftransmission).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(patientnumber).append(currentstatus).append(estimatedonsetdate).append(notes).append(gender).append(source3).append(typeoftransmission).append(agebracket).append(source1).append(source2).append(detectedstate).append(statecode).append(statuschangedate).append(dateannounced).append(detecteddistrict).append(backupnotes).append(nationality).append(contractedfromwhichpatientsuspected).append(detectedcity).append(statepatientnumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RawDatum) == false) {
            return false;
        }
        RawDatum rhs = ((RawDatum) other);
        return new EqualsBuilder().append(patientnumber, rhs.patientnumber).append(currentstatus, rhs.currentstatus).append(estimatedonsetdate, rhs.estimatedonsetdate).append(notes, rhs.notes).append(gender, rhs.gender).append(source3, rhs.source3).append(typeoftransmission, rhs.typeoftransmission).append(agebracket, rhs.agebracket).append(source1, rhs.source1).append(source2, rhs.source2).append(detectedstate, rhs.detectedstate).append(statecode, rhs.statecode).append(statuschangedate, rhs.statuschangedate).append(dateannounced, rhs.dateannounced).append(detecteddistrict, rhs.detecteddistrict).append(backupnotes, rhs.backupnotes).append(nationality, rhs.nationality).append(contractedfromwhichpatientsuspected, rhs.contractedfromwhichpatientsuspected).append(detectedcity, rhs.detectedcity).append(statepatientnumber, rhs.statepatientnumber).isEquals();
    }

}
