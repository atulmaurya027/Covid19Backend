package datasource;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

//Get API call https://api.covid19india.org/data.json
public class CasesTimeseries {

    @SerializedName("positivecasesfromsamplesreported")
    @Expose
    private String positivecasesfromsamplesreported;
    @SerializedName("samplereportedtoday")
    @Expose
    private String samplereportedtoday;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("testsconductedbyprivatelabs")
    @Expose
    private String testsconductedbyprivatelabs;
    @SerializedName("totalindividualstested")
    @Expose
    private String totalindividualstested;
    @SerializedName("totalpositivecases")
    @Expose
    private String totalpositivecases;
    @SerializedName("totalsamplestested")
    @Expose
    private String totalsamplestested;
    @SerializedName("updatetimestamp")
    @Expose
    private String updatetimestamp;

    /**
     * No args constructor for use in serialization
     *
     */
    public CasesTimeseries() {
    }

    /**
     *
     * @param testsconductedbyprivatelabs
     * @param totalsamplestested
     * @param positivecasesfromsamplesreported
     * @param samplereportedtoday
     * @param source
     * @param updatetimestamp
     * @param totalindividualstested
     * @param totalpositivecases
     */
    public CasesTimeseries(String positivecasesfromsamplesreported, String samplereportedtoday, String source, String testsconductedbyprivatelabs, String totalindividualstested, String totalpositivecases, String totalsamplestested, String updatetimestamp) {
        super();
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
        this.samplereportedtoday = samplereportedtoday;
        this.source = source;
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
        this.totalindividualstested = totalindividualstested;
        this.totalpositivecases = totalpositivecases;
        this.totalsamplestested = totalsamplestested;
        this.updatetimestamp = updatetimestamp;
    }

    public String getPositivecasesfromsamplesreported() {
        return positivecasesfromsamplesreported;
    }

    public void setPositivecasesfromsamplesreported(String positivecasesfromsamplesreported) {
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
    }

    public String getSamplereportedtoday() {
        return samplereportedtoday;
    }

    public void setSamplereportedtoday(String samplereportedtoday) {
        this.samplereportedtoday = samplereportedtoday;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTestsconductedbyprivatelabs() {
        return testsconductedbyprivatelabs;
    }

    public void setTestsconductedbyprivatelabs(String testsconductedbyprivatelabs) {
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
    }

    public String getTotalindividualstested() {
        return totalindividualstested;
    }

    public void setTotalindividualstested(String totalindividualstested) {
        this.totalindividualstested = totalindividualstested;
    }

    public String getTotalpositivecases() {
        return totalpositivecases;
    }

    public void setTotalpositivecases(String totalpositivecases) {
        this.totalpositivecases = totalpositivecases;
    }

    public String getTotalsamplestested() {
        return totalsamplestested;
    }

    public void setTotalsamplestested(String totalsamplestested) {
        this.totalsamplestested = totalsamplestested;
    }

    public String getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(String updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("positivecasesfromsamplesreported", positivecasesfromsamplesreported).append("samplereportedtoday", samplereportedtoday).append("source", source).append("testsconductedbyprivatelabs", testsconductedbyprivatelabs).append("totalindividualstested", totalindividualstested).append("totalpositivecases", totalpositivecases).append("totalsamplestested", totalsamplestested).append("updatetimestamp", updatetimestamp).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(testsconductedbyprivatelabs).append(totalsamplestested).append(positivecasesfromsamplesreported).append(samplereportedtoday).append(source).append(updatetimestamp).append(totalindividualstested).append(totalpositivecases).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CasesTimeseries) == false) {
            return false;
        }
        CasesTimeseries rhs = ((CasesTimeseries) other);
        return new EqualsBuilder().append(testsconductedbyprivatelabs, rhs.testsconductedbyprivatelabs).append(totalsamplestested, rhs.totalsamplestested).append(positivecasesfromsamplesreported, rhs.positivecasesfromsamplesreported).append(samplereportedtoday, rhs.samplereportedtoday).append(source, rhs.source).append(updatetimestamp, rhs.updatetimestamp).append(totalindividualstested, rhs.totalindividualstested).append(totalpositivecases, rhs.totalpositivecases).isEquals();
    }

}