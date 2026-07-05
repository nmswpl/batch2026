package in.co.nmsworks.training.week3.weekend;

public enum Language {
    EN("English", "Hello", "Good Bye"),
    TA("Tamil", "Vanakkam", "Poi Vaarungal"),
    FR("French", "Bonjour", "Au revoir"),
    HN("Hindi", "Namaskar", "Namaste");

    private final String displayName;
    private final String greeting;
    private final String farewell;

    Language(String displayName, String greeting, String farewell) {
        this.displayName = displayName;
        this.greeting = greeting;
        this.farewell = farewell;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getFarewell() {
        return farewell;
    }
}
