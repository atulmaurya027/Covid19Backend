package datasource;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PatientStatusWrapper {

    @SerializedName("deaths_recoveries")
    @Expose
    private List<PatientStatus> patientStatus = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public PatientStatusWrapper() {
    }

    /**
     *
     * @param patientStatus
     */
    public PatientStatusWrapper(List<PatientStatus> patientStatus) {
        super();
        this.patientStatus = patientStatus;
    }

    public List<PatientStatus> getDeathsRecoveries() {
        return patientStatus;
    }

    public void setDeathsRecoveries(List<PatientStatus> patientStatus) {
        this.patientStatus = patientStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("patientStatus", patientStatus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(patientStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatientStatusWrapper) == false) {
            return false;
        }
        PatientStatusWrapper rhs = ((PatientStatusWrapper) other);
        return new EqualsBuilder().append(patientStatus, rhs.patientStatus).isEquals();
    }

}