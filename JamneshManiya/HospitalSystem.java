package JamneshManiya;
import java.util.*;
import java.util.Set;

public class HospitalSystem {

    private int patientId;
    private String name;
    private int age;

    static Set<HospitalSystem> patients = new HashSet<>();

    public HospitalSystem(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public static void registrationPatient(HospitalSystem patient) {
        if (patients.contains(patient)) {
            System.out.println("Patient ID " + patient.patientId + " is already registered");
        } else {
            patients.add(patient);
            System.out.println("Patient added: " + patient);
        }
    }

    public static void displayPatient() {
        System.out.println("List of Unique Registered Patients:");
        for (HospitalSystem p : patients) {
            System.out.println(p);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HospitalSystem patient = (HospitalSystem) obj;
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

        HospitalSystem p1 = new HospitalSystem(101, "Ravi", 30);
        HospitalSystem p2 = new HospitalSystem(102, "Ram", 28);
        HospitalSystem p3 = new HospitalSystem(101, "Ramesh", 40);

        registrationPatient(p1);
        registrationPatient(p2);
        registrationPatient(p3);

        displayPatient();
    }
}
