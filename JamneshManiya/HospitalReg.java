package JamneshManiya;
import java.util.*;

public class HospitalReg {

    static Map<Integer, String> patients = new HashMap<>();

    static void addPatient(int id, String name) {
        if (patients.containsKey(id)) {
            System.out.println("Patient " + id + " already exists");
        } else {
            patients.put(id, name);
            System.out.println("Patient added");
        }
    }

    static void checkPatient(int id) {
        if (patients.containsKey(id)) {
            System.out.println("Patient found: " + id + " = " + patients.get(id));
        } else {
            System.out.println("Patient not found");
        }
    }

    static void updatePatient(int id, String name) {
        if (patients.containsKey(id)) {
            patients.put(id, name);
            System.out.println("Patient updated");
        } else {
            System.out.println("Patient not found");
        }
    }

    static void removePatient(int id) {
        if (patients.remove(id) != null) {
            System.out.println("Patient removed");
        } else {
            System.out.println("Patient not found");
        }
    }

    static void displayPatients() {
        System.out.println("Patient List:");
        patients.forEach((id, name) ->
            System.out.println(id + " = " + name)
        );
    }

    public static void main(String[] args) {

        addPatient(101, "Jamnesh");
        addPatient(102, "Maniya");
        addPatient(103, "Ramesh");
        addPatient(104, "Ram");

        checkPatient(101);

        updatePatient(101, "Jamnesh M");

        System.out.println("Total patients: " + patients.size());

        displayPatients();

        removePatient(102);

        displayPatients();

        patients.clear();
        System.out.println("System cleared");
    }
}
