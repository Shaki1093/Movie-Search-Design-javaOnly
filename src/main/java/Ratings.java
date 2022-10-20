import com.fasterxml.jackson.annotation.JsonProperty;

public class Ratings {
    @JsonProperty("Value")
    private String Value;
    @JsonProperty("Source")
    private String Source;

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }
}
