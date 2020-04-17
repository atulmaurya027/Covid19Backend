package datasource;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

//GET API call https://api.covid19india.org/v2/state_district_wise.json
public class State implements Serializable {

    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("districtData")
    @Expose
    private List<DistrictData> districtData = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public State() {
    }

    /**
     *
     * @param districtData
     * @param state
     */
    public State(String state, List<DistrictData> districtData) {
        super();
        this.state = state;
        this.districtData = districtData;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<DistrictData> getDistrictData() {
        return districtData;
    }

    public void setDistrictData(List<DistrictData> districtData) {
        this.districtData = districtData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("state", state).append("districtData", districtData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(districtData).append(state).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof State) == false) {
            return false;
        }
        State rhs = ((State) other);
        return new EqualsBuilder().append(districtData, rhs.districtData).append(state, rhs.state).isEquals();
    }

}