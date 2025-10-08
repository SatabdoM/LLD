
public class AppSettings {
    // Step 1 : Private static instance of the class
    private static AppSettings instance; //static variable 

    private String databaseUrl;
    private String apiKey;

    // Step 2 : Private constructor to prevent instantiation from outside
    private AppSettings() {
        databaseUrl = "localhost:5432";
        apiKey = "12345-ABCDE";
    }

    // Step 3 : Public static method to provide access to the instance
    public static AppSettings getInstance() {
        instance = new AppSettings();
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
