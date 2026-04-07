import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }
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
        // ================= UC7 =================
        System.out.println("\n=====================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("=====================================\n");

// Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));

// Sort using Comparator (ascending capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

// Display sorted bogies
        System.out.println("Bogies Sorted by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
// ================= UC8 =================
        System.out.println("\n=====================================");
        System.out.println("UC8 - Filter Bogies using Streams");
        System.out.println("=====================================\n");

// Reuse bogies list from UC7

// Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

// Display filtered bogies
        System.out.println("Bogies with capacity > 60:");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }
// ================= UC9 =================
        System.out.println("\n=====================================");
        System.out.println("UC9 - Group Bogies using Streams");
        System.out.println("=====================================\n");

// Group bogies based on type (capacity-based classification)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> {
                    if (b.capacity >= 60) return "High Capacity";
                    else if (b.capacity >= 40) return "Medium Capacity";
                    else return "Low Capacity";
                }));

// Display grouped bogies
        System.out.println("Grouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
// ================= UC10 =================
        System.out.println("\n=====================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("=====================================\n");

// Calculate total capacity using stream
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // extract capacities
                .reduce(0, Integer::sum);   // sum all values

// Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

// ================= UC11 =================
        System.out.println("\n=====================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("=====================================\n");

// Sample inputs (you can change for demo)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AZ";

// Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

// Validate using matches()
        boolean isTrainValid = trainId.matches(trainPattern);
        boolean isCargoValid = cargoCode.matches(cargoPattern);

// Display results
        if (isTrainValid) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID format.");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code format.");
        }











        // FINAL STATE
        System.out.println("Final Passenger Bogies: " + passengerBogies);
    }
}