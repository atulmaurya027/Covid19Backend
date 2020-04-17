package datasource;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class District {

    @SerializedName("confirmed")
    @Expose
    private Integer confirmed;
    @SerializedName("lastupdatedtime")
    @Expose
    private String lastupdatedtime;
    @SerializedName("delta")
    @Expose
    private Delta delta;

    /**
     * No args constructor for use in serialization
     *
     */
    public District() {
    }

    /**
     *
     * @param delta
     * @param confirmed
     * @param lastupdatedtime
     */
    public District(Integer confirmed, String lastupdatedtime, Delta delta) {
        super();
        this.confirmed = confirmed;
        this.lastupdatedtime = lastupdatedtime;
        this.delta = delta;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public String getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(String lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public Delta getDelta() {
        return delta;
    }

    public void setDelta(Delta delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("confirmed", confirmed).append("lastupdatedtime", lastupdatedtime).append("delta", delta).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(delta).append(confirmed).append(lastupdatedtime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof District) == false) {
            return false;
        }
        District rhs = ((District) other);
        return new EqualsBuilder().append(delta, rhs.delta).append(confirmed, rhs.confirmed).append(lastupdatedtime, rhs.lastupdatedtime).isEquals();
    }

}