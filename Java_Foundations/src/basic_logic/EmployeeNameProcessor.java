package basic_logic;

public class EmployeeNameProcessor {

    public static void main(String[] args) {

        String[] employeeNames = {"Renu Sai", "Akhil Kumar", "John Doe", "Meera"};

        for (int i = 0; i < employeeNames.length; i++) {

            String employeeName = employeeNames[i];

            System.out.println(employeeName.toUpperCase());

            StringBuffer reversedName = new StringBuffer(employeeName);
            System.out.println(reversedName.reverse());

            StringBuilder verifiedName = new StringBuilder(employeeName);
            System.out.println(verifiedName.append("-verified"));

            if (employeeName.length() > 10) {
                System.out.println("Employee: " + employeeName + " Long Name");

            } else if (employeeName.contains(" ")) {
                System.out.println("Employee: " + employeeName + " Two Word Name");

            } else {
                System.out.println("Employee: " + employeeName + " Normal Name");
            }
        }
    }
}