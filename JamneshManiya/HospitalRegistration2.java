package JamneshManiya;

import java.util.*;

public class HospitalRegistration2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> patientIds = new HashSet<>();

        System.out.println("--- Hospital Patient Registration System ---");

        while (true) {
            System.out.println("\n1. Register New Patient (Enter ID)");
            System.out.println("2. View All Registered IDs");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient Unique ID: ");
                    int id = sc.nextInt();
                    
                    if (patientIds.add(id)) {
                        System.out.println("Success: Patient added to the system.");
                    } else {
                        System.out.println("Error: ID " + id + " is already registered!");
                    }
                    break;

                case 2:
                    System.out.println("List of Unique Patients");
                    if (patientIds.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        for (Integer patientId : patientIds) {
                            System.out.println("Patient ID: " + patientId);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exit");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}