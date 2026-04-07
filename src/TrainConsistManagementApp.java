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
// ================= UC3 =================
        System.out.println("\n=====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================\n");

// Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

// ADD IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");

// Duplicate entries (will be ignored automatically)
        bogieIds.add("BG101");
        bogieIds.add("BG102");

// Display result
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");

// ================= UC4 =================
        System.out.println("\n=====================================");
        System.out.println("UC4 - Maintain Ordered Train Consist");
        System.out.println("=====================================\n");

// Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

// Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist: " + train);

// Insert Pantry Car at position 2 (index 2)
        train.add(2, "Pantry Car");
        System.out.println("After Adding Pantry Car: " + train);

// Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("After Removing First and Last Bogie: " + train);

// Final state
        System.out.println("Final Train Consist: " + train);

        // ================= UC5 =================
        System.out.println("\n=====================================");
        System.out.println("UC5 - Preserve Order with Uniqueness");
        System.out.println("=====================================\n");

// Create LinkedHashSet for ordered + unique bogies
        Set<String> trainSet = new LinkedHashSet<>();

// Add bogies
        trainSet.add("Engine");
        trainSet.add("Sleeper");
        trainSet.add("Cargo");
        trainSet.add("Guard");

// Try adding duplicate
        trainSet.add("Sleeper"); // duplicate

// Display final formation
        System.out.println("Final Train Formation (Ordered + Unique):");
        System.out.println(trainSet);

        // ================= UC6 =================
        System.out.println("\n=====================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("=====================================\n");

// Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

// Insert data (key = bogie, value = capacity)
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 30);

// Display capacity of a specific bogie
        System.out.println("Capacity of Sleeper: " + bogieCapacity.get("Sleeper"));

// Iterate through map
        System.out.println("\nAll Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }










        // FINAL STATE
        System.out.println("Final Passenger Bogies: " + passengerBogies);
    }
}