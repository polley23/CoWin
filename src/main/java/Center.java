import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "center_id",
        "name",
        "name_l",
        "state_name",
        "state_name_l",
        "district_name",
        "district_name_l",
        "block_name",
        "block_name_l",
        "pincode",
        "lat",
        "long",
        "from",
        "to",
        "fee_type",
        "vaccine_fees",
        "sessions"
})
@Generated("jsonschema2pojo")
public class Center {

    @JsonProperty("center_id")
    private Integer centerId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name_l")
    private String nameL;
    @JsonProperty("state_name")
    private String stateName;
    @JsonProperty("state_name_l")
    private String stateNameL;
    @JsonProperty("district_name")
    private String districtName;
    @JsonProperty("district_name_l")
    private String districtNameL;
    @JsonProperty("block_name")
    private String blockName;
    @JsonProperty("block_name_l")
    private String blockNameL;
    @JsonProperty("pincode")
    private String pincode;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("long")
    private Double _long;
    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("fee_type")
    private String feeType;
    @JsonProperty("vaccine_fees")
    private List<VaccineFee> vaccineFees = null;
    @JsonProperty("sessions")
    private List<Session> sessions = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Center() {
    }

    /**
     *
     * @param centerId
     * @param pincode
     * @param blockNameL
     * @param sessions
     * @param districtName
     * @param districtNameL
     * @param blockName
     * @param stateNameL
     * @param feeType
     * @param stateName
     * @param _long
     * @param name
     * @param nameL
     * @param from
     * @param to
     * @param lat
     * @param vaccineFees
     */
    public Center(Integer centerId, String name, String nameL, String stateName, String stateNameL, String districtName, String districtNameL, String blockName, String blockNameL, String pincode, Double lat, Double _long, String from, String to, String feeType, List<VaccineFee> vaccineFees, List<Session> sessions) {
        super();
        this.centerId = centerId;
        this.name = name;
        this.nameL = nameL;
        this.stateName = stateName;
        this.stateNameL = stateNameL;
        this.districtName = districtName;
        this.districtNameL = districtNameL;
        this.blockName = blockName;
        this.blockNameL = blockNameL;
        this.pincode = pincode;
        this.lat = lat;
        this._long = _long;
        this.from = from;
        this.to = to;
        this.feeType = feeType;
        this.vaccineFees = vaccineFees;
        this.sessions = sessions;
    }

    @JsonProperty("center_id")
    public Integer getCenterId() {
        return centerId;
    }

    @JsonProperty("center_id")
    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public Center withCenterId(Integer centerId) {
        this.centerId = centerId;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Center withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name_l")
    public String getNameL() {
        return nameL;
    }

    @JsonProperty("name_l")
    public void setNameL(String nameL) {
        this.nameL = nameL;
    }

    public Center withNameL(String nameL) {
        this.nameL = nameL;
        return this;
    }

    @JsonProperty("state_name")
    public String getStateName() {
        return stateName;
    }

    @JsonProperty("state_name")
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Center withStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    @JsonProperty("state_name_l")
    public String getStateNameL() {
        return stateNameL;
    }

    @JsonProperty("state_name_l")
    public void setStateNameL(String stateNameL) {
        this.stateNameL = stateNameL;
    }

    public Center withStateNameL(String stateNameL) {
        this.stateNameL = stateNameL;
        return this;
    }

    @JsonProperty("district_name")
    public String getDistrictName() {
        return districtName;
    }

    @JsonProperty("district_name")
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Center withDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    @JsonProperty("district_name_l")
    public String getDistrictNameL() {
        return districtNameL;
    }

    @JsonProperty("district_name_l")
    public void setDistrictNameL(String districtNameL) {
        this.districtNameL = districtNameL;
    }

    public Center withDistrictNameL(String districtNameL) {
        this.districtNameL = districtNameL;
        return this;
    }

    @JsonProperty("block_name")
    public String getBlockName() {
        return blockName;
    }

    @JsonProperty("block_name")
    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public Center withBlockName(String blockName) {
        this.blockName = blockName;
        return this;
    }

    @JsonProperty("block_name_l")
    public String getBlockNameL() {
        return blockNameL;
    }

    @JsonProperty("block_name_l")
    public void setBlockNameL(String blockNameL) {
        this.blockNameL = blockNameL;
    }

    public Center withBlockNameL(String blockNameL) {
        this.blockNameL = blockNameL;
        return this;
    }

    @JsonProperty("pincode")
    public String getPincode() {
        return pincode;
    }

    @JsonProperty("pincode")
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Center withPincode(String pincode) {
        this.pincode = pincode;
        return this;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Center withLat(Double lat) {
        this.lat = lat;
        return this;
    }

    @JsonProperty("long")
    public Double getLong() {
        return _long;
    }

    @JsonProperty("long")
    public void setLong(Double _long) {
        this._long = _long;
    }

    public Center withLong(Double _long) {
        this._long = _long;
        return this;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    public Center withFrom(String from) {
        this.from = from;
        return this;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    public Center withTo(String to) {
        this.to = to;
        return this;
    }

    @JsonProperty("fee_type")
    public String getFeeType() {
        return feeType;
    }

    @JsonProperty("fee_type")
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Center withFeeType(String feeType) {
        this.feeType = feeType;
        return this;
    }

    @JsonProperty("vaccine_fees")
    public List<VaccineFee> getVaccineFees() {
        return vaccineFees;
    }

    @JsonProperty("vaccine_fees")
    public void setVaccineFees(List<VaccineFee> vaccineFees) {
        this.vaccineFees = vaccineFees;
    }

    public Center withVaccineFees(List<VaccineFee> vaccineFees) {
        this.vaccineFees = vaccineFees;
        return this;
    }

    @JsonProperty("sessions")
    public List<Session> getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public Center withSessions(List<Session> sessions) {
        this.sessions = sessions;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Center withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
