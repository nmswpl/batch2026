package in.co.nmsworks.training.week3practices;


class Guest {
    private String id;
    private String name;
    private Language preferredLanguage;

    public Guest(String id, String name, Language preferredLanguage) {
        this.id = id;
        this.name = name;
        this.preferredLanguage = preferredLanguage;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Language getPreferredLanguage() { return preferredLanguage; }
}