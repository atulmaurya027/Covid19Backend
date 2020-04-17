package datasource;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PatientStatus {

    @SerializedName("agebracket")
    @Expose
    private String agebracket;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("patientstatus")
    @Expose
    private String deceased;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("patientnumbercouldbemappedlater")
    @Expose
    private String patientnumbercouldbemappedlater;
    @SerializedName("slno")
    @Expose
    private String slno;
    @SerializedName("source1")
    @Expose
    private String source1;
    @SerializedName("source2")
    @Expose
    private String source2;
    @SerializedName("source3")
    @Expose
    private String source3;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("statecode")
    @Expose
    private String statecode;

    /**
     * No args constructor for use in serialization
     *
     */
    public PatientStatus() {
    }

    /**
     *
     * @param date
     * @param deceased
     * @param notes
     * @param gender
     * @param source3
     * @param city
     * @param agebracket
     * @param source1
     * @param source2
     * @param statecode
     * @param slno
     * @param patientnumbercouldbemappedlater
     * @param nationality
     * @param district
     * @param state
     */
    public PatientStatus(String agebracket, String city, String date, String deceased, String district, String gender, String nationality, String notes, String patientnumbercouldbemappedlater, String slno, String source1, String source2, String source3, String state, String statecode) {
        super();
        this.agebracket = agebracket;
        this.city = city;
        this.date = date;
        this.deceased = deceased;
        this.district = district;
        this.gender = gender;
        this.nationality = nationality;
        this.notes = notes;
        this.patientnumbercouldbemappedlater = patientnumbercouldbemappedlater;
        this.slno = slno;
        this.source1 = source1;
        this.source2 = source2;
        this.source3 = source3;
        this.state = state;
        this.statecode = statecode;
    }

    public String getAgebracket() {
        return agebracket;
    }

    public void setAgebracket(String agebracket) {
        this.agebracket = agebracket;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeceased() {
        return deceased;
    }

    public void setDeceased(String deceased) {
        this.deceased = deceased;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    public String getPatientnumbercouldbemappedlater() {
        return patientnumbercouldbemappedlater;
    }

    public void setPatientnumbercouldbemappedlater(String patientnumbercouldbemappedlater) {
        this.patientnumbercouldbemappedlater = patientnumbercouldbemappedlater;
    }

    public String getSlno() {
        return slno;
    }

    public void setSlno(String slno) {
        this.slno = slno;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("agebracket", agebracket).append("city", city).append("date", date).append("deceased", deceased).append("district", district).append("gender", gender).append("nationality", nationality).append("notes", notes).append("patientnumbercouldbemappedlater", patientnumbercouldbemappedlater).append("slno", slno).append("source1", source1).append("source2", source2).append("source3", source3).append("state", state).append("statecode", statecode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(deceased).append(notes).append(gender).append(source3).append(city).append(agebracket).append(source1).append(source2).append(statecode).append(slno).append(patientnumbercouldbemappedlater).append(nationality).append(district).append(state).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatientStatus) == false) {
            return false;
        }
        PatientStatus rhs = ((PatientStatus) other);
        return new EqualsBuilder().append(date, rhs.date).append(deceased, rhs.deceased).append(notes, rhs.notes).append(gender, rhs.gender).append(source3, rhs.source3).append(city, rhs.city).append(agebracket, rhs.agebracket).append(source1, rhs.source1).append(source2, rhs.source2).append(statecode, rhs.statecode).append(slno, rhs.slno).append(patientnumbercouldbemappedlater, rhs.patientnumbercouldbemappedlater).append(nationality, rhs.nationality).append(district, rhs.district).append(state, rhs.state).isEquals();
    }

}