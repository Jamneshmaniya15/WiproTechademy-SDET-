package collections;
import java.util.*;
import java.util.Set;

public class HospitalSystemUsingMap {

    private int patientId;
    private String name;
    private int age;

    static Set<HospitalSystemUsingMap> patients = new HashSet<>();

    public HospitalSystemUsingMap(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public static void registrationPatient(HospitalSystemUsingMap patient) {
        if (patients.contains(patient)) {
            System.out.println("Patient ID " + patient.patientId + " is already registered");
        } else {
            patients.add(patient);
            System.out.println("Patient added: " + patient);
        }
    }

    public static void displayPatient() {
        System.out.println("List of Unique Registered Patients:");
        for (HospitalSystemUsingMap p : patients) {
            System.out.println(p);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HospitalSystemUsingMap patient = (HospitalSystemUsingMap) obj;
        return this.patientId == patient.patientId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(patientId);
    }

    @Override
    public String toString() {
        return "Patient [ID=" + patientId + ", Name=" + name + ", Age=" + age + "]";
    }

    public static void main(String[] args) {

    	HospitalSystemUsingMap p1 = new HospitalSystemUsingMap(101, "Ravi", 30);
    	HospitalSystemUsingMap p2 = new HospitalSystemUsingMap(102, "Ram", 28);
    	HospitalSystemUsingMap p3 = new HospitalSystemUsingMap(101, "Ramesh", 40);

        registrationPatient(p1);
        registrationPatient(p2);
        registrationPatient(p3);

        displayPatient();
    }
}
