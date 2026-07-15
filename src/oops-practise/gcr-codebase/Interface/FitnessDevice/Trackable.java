package Interface.FitnessDevice;

public interface Trackable {
    String id ="101";   //BY DEFAULT -> public static final eg (public static final String id ="101")
    void logActivity();

    default void resetData(){
        System.out.println("reset data"); // Inteview ques -> interface m method m body bnanae ke liye deafult keyword lagana jaruri h
    }
}
