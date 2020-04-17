package responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class HistoryData {

    @SerializedName("history")
    @Expose
    private List<History> history = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public HistoryData() {
    }

    /**
     *
     * @param history
     */
    public HistoryData(List<History> history) {
        super();
        this.history = history;
    }

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("history", history).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(history).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HistoryData) == false) {
            return false;
        }
        HistoryData rhs = ((HistoryData) other);
        return new EqualsBuilder().append(history, rhs.history).isEquals();
    }

}
