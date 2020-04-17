package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class History {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("confirmed")
    @Expose
    private String confirmed;
    @SerializedName("recovered")
    @Expose
    private String recovered;
    @SerializedName("deaths")
    @Expose
    private String deaths;

    /**
     * No args constructor for use in serialization
     *
     */
    public History() {
    }

    /**
     *
     * @param date
     * @param recovered
     * @param confirmed
     * @param deaths
     */
    public History(String date, String confirmed, String recovered, String deaths) {
        super();
        this.date = date;
        this.confirmed = confirmed;
        this.recovered = recovered;
        this.deaths = deaths;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("date", date).append("confirmed", confirmed).append("recovered", recovered).append("deaths", deaths).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(recovered).append(confirmed).append(deaths).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof History) == false) {
            return false;
        }
        History rhs = ((History) other);
        return new EqualsBuilder().append(date, rhs.date).append(recovered, rhs.recovered).append(confirmed, rhs.confirmed).append(deaths, rhs.deaths).isEquals();
    }

}
