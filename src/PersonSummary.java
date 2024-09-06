import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PersonSummary {
    @JsonProperty("person")
    private Person person;
    @JsonProperty("addresses")
    private List<Address> addresses;
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    // Getters and Setters
}