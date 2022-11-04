public class Application {
    private static Application application = null;

    private Application() {}

    public static synchronized Application getInstance() {
        if(application == null) application = new Application();
        return application;
    }
}
