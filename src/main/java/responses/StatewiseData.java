package responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StatewiseData {

    @SerializedName("statewise")
    @Expose
    private List<Statewise> statewise = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public StatewiseData() {
    }

    /**
     *
     * @param statewise
     */
    public StatewiseData(List<Statewise> statewise) {
        super();
        this.statewise = statewise;
    }

    public List<Statewise> getStatewise() {
        return statewise;
    }

    public void setStatewise(List<Statewise> statewise) {
        this.statewise = statewise;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statewise", statewise).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statewise).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatewiseData) == false) {
            return false;
        }
        StatewiseData rhs = ((StatewiseData) other);
        return new EqualsBuilder().append(statewise, rhs.statewise).isEquals();
    }

}
