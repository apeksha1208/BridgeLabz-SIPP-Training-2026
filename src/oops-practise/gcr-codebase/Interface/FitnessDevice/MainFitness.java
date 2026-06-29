package Interface.FitnessDevice;

public class MainFitness {
    public static void main(String[] args) {
        FitnessDevice fd = new FitnessDevice();
        fd.generateReport();
        fd.sendalert();
        fd.logActivity();
    }
}
