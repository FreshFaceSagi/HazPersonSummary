import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
    public static void main(String[] args) {
        String json = "{ \"personDetails\": { \"person\": { \"name\": \"John\", \"age\": 30 }, \"addresses\": [ { \"street\": \"123 Main St\", \"city\": \"New York\" }, { \"street\": \"456 Maple Dr\", \"city\": \"Los Angeles\" } ], \"phoneNumber\": \"123-456-7890\" } }";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            PersonSummary personSummary = objectMapper.readValue(json, PersonSummary.class);
            System.out.println(personSummary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}