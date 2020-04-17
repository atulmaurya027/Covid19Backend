package responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DistrictwiseData {

    @SerializedName("districtwise")
    @Expose
    private List<Districtwise> districtwise = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public DistrictwiseData() {
    }

    /**
     *
     * @param districtwise
     */
    public DistrictwiseData(List<Districtwise> districtwise) {
        super();
        this.districtwise = districtwise;
    }

    public List<Districtwise> getDistrictwise() {
        return districtwise;
    }

    public void setDistrictwise(List<Districtwise> districtwise) {
        this.districtwise = districtwise;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("districtwise", districtwise).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(districtwise).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistrictwiseData) == false) {
            return false;
        }
        DistrictwiseData rhs = ((DistrictwiseData) other);
        return new EqualsBuilder().append(districtwise, rhs.districtwise).isEquals();
    }

}
