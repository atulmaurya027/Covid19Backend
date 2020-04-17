package datasource;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Delta {

    @SerializedName("confirmed")
    @Expose
    private Integer confirmed;

    /**
     * No args constructor for use in serialization
     *
     */
    public Delta() {
    }

    /**
     *
     * @param confirmed
     */
    public Delta(Integer confirmed) {
        super();
        this.confirmed = confirmed;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("confirmed", confirmed).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(confirmed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Delta) == false) {
            return false;
        }
        Delta rhs = ((Delta) other);
        return new EqualsBuilder().append(confirmed, rhs.confirmed).isEquals();
    }

}