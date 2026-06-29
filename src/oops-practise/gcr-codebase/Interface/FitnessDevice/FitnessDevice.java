package Interface.FitnessDevice;

public class FitnessDevice implements Trackable, Notifiable, Reportable {


    @Override
    public void logActivity() {
        System.out.println("Please login again");
    }

    @Override
    public void sendalert() {
        System.out.println("This is your alert");
    }

    @Override
    public void generateReport() {
        System.out.println("Report has been generated");
    }
}
