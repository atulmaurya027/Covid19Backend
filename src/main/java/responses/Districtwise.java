package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Districtwise {

    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("total_confirmed")
    @Expose
    private String totalConfirmed;
    @SerializedName("total_recovered")
    @Expose
    private String totalRecovered;
    @SerializedName("total_deaths")
    @Expose
    private String totalDeaths;

    /**
     * No args constructor for use in serialization
     *
     */
    public Districtwise() {
    }

    /**
     *
     * @param totalDeaths
     * @param district
     * @param totalRecovered
     * @param totalConfirmed
     */
    public Districtwise(String district, String totalConfirmed, String totalRecovered, String totalDeaths) {
        super();
        this.district = district;
        this.totalConfirmed = totalConfirmed;
        this.totalRecovered = totalRecovered;
        this.totalDeaths = totalDeaths;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("district", district).append("totalConfirmed", totalConfirmed).append("totalRecovered", totalRecovered).append("totalDeaths", totalDeaths).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalRecovered).append(totalConfirmed).append(totalDeaths).append(district).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Districtwise) == false) {
            return false;
        }
        Districtwise rhs = ((Districtwise) other);
        return new EqualsBuilder().append(totalRecovered, rhs.totalRecovered).append(totalConfirmed, rhs.totalConfirmed).append(totalDeaths, rhs.totalDeaths).append(district, rhs.district).isEquals();
    }

}
