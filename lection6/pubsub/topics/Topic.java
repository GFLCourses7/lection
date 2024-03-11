package topics;

public enum Topic {
    NEWS("news"),
    IT("it"),
    ART("art");

    private final String value;
    Topic(String topic){
        this.value = topic;
    }

    public String getValue() {
        return value;
    }
}
