public class Singleton {

    public static void main(String args[]) {
        AppSettings settings = AppSettings.getInstance();
        AppSettings settingsCopy = AppSettings.getInstance();
        System.out.println(settings == settingsCopy); // should print true
    }

}
