package responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import datasource.StatesHistory;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StatesHistoryWrapper {

    @SerializedName("states_daily")
    @Expose
    private List<StatesHistory> statesHistory = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public StatesHistoryWrapper() {
    }

    /**
     *
     * @param statesHistory
     */
    public StatesHistoryWrapper(List<StatesHistory> statesHistory) {
        super();
        this.statesHistory = statesHistory;
    }

    public List<StatesHistory> getStatesHistory() {
        return statesHistory;
    }

    public void setStatesHistory(List<StatesHistory> statesHistory) {
        this.statesHistory = statesHistory;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statesHistory", statesHistory).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statesHistory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatesHistoryWrapper) == false) {
            return false;
        }
        StatesHistoryWrapper rhs = ((StatesHistoryWrapper) other);
        return new EqualsBuilder().append(statesHistory, rhs.statesHistory).isEquals();
    }

}