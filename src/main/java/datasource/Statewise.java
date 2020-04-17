package datasource;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Statewise {

    @SerializedName("State")
    @Expose
    private State state;

    /**
     * No args constructor for use in serialization
     *
     */
    public Statewise() {
    }

    /**
     *
     * @param state
     */
    public Statewise(State state) {
        super();
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("state", state).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(state).toHashCode();
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
        return new EqualsBuilder().append(state, rhs.state).isEquals();
    }

}