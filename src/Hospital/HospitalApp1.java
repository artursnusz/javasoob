package Hospital;

public class HospitalApp1 {
    public static void main(String[] args) {
        final String appName = "Hospital v0.9";
        System.out.println(appName);
        HospitalApp hospitalApp = new HospitalApp();
        hospitalApp.controlLoop();
    }
}
