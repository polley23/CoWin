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
        "session_id",
        "date",
        "available_capacity",
        "min_age_limit",
        "vaccine",
        "slots"
})
@Generated("jsonschema2pojo")
public class Session {

    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("available_capacity")
    private Integer availableCapacity;
    @JsonProperty("min_age_limit")
    private Integer minAgeLimit;
    @JsonProperty("vaccine")
    private String vaccine;
    @JsonProperty("slots")
    private List<String> slots = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Session() {
    }

    /**
     *
     * @param date
     * @param availableCapacity
     * @param minAgeLimit
     * @param vaccine
     * @param slots
     * @param sessionId
     */
    public Session(String sessionId, String date, Integer availableCapacity, Integer minAgeLimit, String vaccine, List<String> slots) {
        super();
        this.sessionId = sessionId;
        this.date = date;
        this.availableCapacity = availableCapacity;
        this.minAgeLimit = minAgeLimit;
        this.vaccine = vaccine;
        this.slots = slots;
    }

    @JsonProperty("session_id")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("session_id")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Session withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Session withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("available_capacity")
    public Integer getAvailableCapacity() {
        return availableCapacity;
    }

    @JsonProperty("available_capacity")
    public void setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public Session withAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    @JsonProperty("min_age_limit")
    public Integer getMinAgeLimit() {
        return minAgeLimit;
    }

    @JsonProperty("min_age_limit")
    public void setMinAgeLimit(Integer minAgeLimit) {
        this.minAgeLimit = minAgeLimit;
    }

    public Session withMinAgeLimit(Integer minAgeLimit) {
        this.minAgeLimit = minAgeLimit;
        return this;
    }

    @JsonProperty("vaccine")
    public String getVaccine() {
        return vaccine;
    }

    @JsonProperty("vaccine")
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public Session withVaccine(String vaccine) {
        this.vaccine = vaccine;
        return this;
    }

    @JsonProperty("slots")
    public List<String> getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(List<String> slots) {
        this.slots = slots;
    }

    public Session withSlots(List<String> slots) {
        this.slots = slots;
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

    public Session withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
