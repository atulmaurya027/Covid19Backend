package datasource;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

//Get API call https://api.covid19india.org/raw_data.json
public class RawData {

    @SerializedName("raw_data")
    @Expose
    private List<RawDatum> rawData = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public RawData() {
    }

    /**
     *
     * @param rawData
     */
    public RawData(List<RawDatum> rawData) {
        super();
        this.rawData = rawData;
    }

    public List<RawDatum> getRawData() {
        return rawData;
    }

    public void setRawData(List<RawDatum> rawData) {
        this.rawData = rawData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rawData", rawData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rawData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RawData) == false) {
            return false;
        }
        RawData rhs = ((RawData) other);
        return new EqualsBuilder().append(rawData, rhs.rawData).isEquals();
    }

}