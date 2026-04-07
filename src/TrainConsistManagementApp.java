import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...\n");


        // ================= UC2 =================
        System.out.println("=====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================\n");

        // Create passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        // CREATE (Add bogies)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies Added: " + passengerBogies);

        // DELETE (Remove one bogie)
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing AC Chair: " + passengerBogies);

        // READ (Check existence)
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // FINAL STATE
        System.out.println("Final Passenger Bogies: " + passengerBogies);
    }
}