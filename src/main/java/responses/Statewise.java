package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Statewise {

    @SerializedName("state")
    @Expose
    private String state;
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
    public Statewise() {
    }

    /**
     *
     * @param state
     * @param totalDeaths
     * @param totalRecovered
     * @param totalConfirmed
     */
    public Statewise(String state, String totalConfirmed, String totalRecovered, String totalDeaths) {
        super();
        this.state = state;
        this.totalConfirmed = totalConfirmed;
        this.totalRecovered = totalRecovered;
        this.totalDeaths = totalDeaths;
    }

    public String getState() {
        return state;
    }

    public void setState(String stae) {
        this.state = stae;
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
        return new ToStringBuilder(this).append("stae", state).append("totalConfirmed", totalConfirmed).append("totalRecovered", totalRecovered).append("totalDeaths", totalDeaths).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalRecovered).append(state).append(totalConfirmed).append(totalDeaths).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Statewise) == false) {
            return false;
        }
        Statewise rhs = ((Statewise) other);
        return new EqualsBuilder().append(totalRecovered, rhs.totalRecovered).append(state, rhs.state).append(totalConfirmed, rhs.totalConfirmed).append(totalDeaths, rhs.totalDeaths).isEquals();
    }

}