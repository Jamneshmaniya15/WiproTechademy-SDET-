package JamneshManiya;
import java.util.*;

public class HospitalSys {

    private int patientId;
    private String name;
    private int age;

    static Map<Integer, HospitalSys> patients = new HashMap<>();

    public HospitalSys(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public static void registrationPatient(HospitalSys patient) {
        if (patients.containsKey(patient.patientId)) {
            System.out.println("Patient ID " + patient.patientId + " is already registered");
        } else {
            patients.put(patient.patientId, patient);
            System.out.println("Patient added: " + patient);
        }
    }

    public static void checkPatient(int patientId) {
        if (patients.containsKey(patientId)) {
            System.out.println("Patient with ID " + patientId + " is present");
            System.out.println(patients.get(patientId));
        } else {
            System.out.println("Patient with ID " + patientId + " not found");
        }
    }

    public static void displayPatient() {
        System.out.println("List of Registered Patients:");
        for (HospitalSys p : patients.values()) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Patient [ID=" + patientId + ", Name=" + name + ", Age=" + age + "]";
    }

    public static void main(String[] args) {

        HospitalSys p1 = new HospitalSys(101, "Ravi", 30);
        HospitalSys p2 = new HospitalSys(102, "Ram", 28);
        HospitalSys p3 = new HospitalSys(101, "Ramesh", 40);

        registrationPatient(p1);
        registrationPatient(p2);
        registrationPatient(p3);

        checkPatient(101);
        checkPatient(105);

        displayPatient();
    }
}
