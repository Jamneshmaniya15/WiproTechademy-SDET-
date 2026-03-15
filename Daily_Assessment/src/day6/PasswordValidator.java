package day6;

import java.util.Scanner;

//Custom exception class
class InvalidPasswordException extends Exception {
 public InvalidPasswordException(String message) {
     super(message);
 }
}

public class PasswordValidator {
 private static void validatePassword(String password) throws InvalidPasswordException {
     // Write your logic here
     if (password.length() < 8) {
         throw new InvalidPasswordException("Password must be at least 8 characters long.");
     }

     boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

     for (char c : password.toCharArray()) {
         if (Character.isUpperCase(c)) hasUpper = true;
         else if (Character.isLowerCase(c)) hasLower = true;
         else if (Character.isDigit(c)) hasDigit = true;
         else hasSpecial = true;
     }

     if (!hasUpper) {
         throw new InvalidPasswordException("Password must contain at least one uppercase letter.");
     }
     if (!hasLower) {
         throw new InvalidPasswordException("Password must contain at least one lowercase letter.");
     }
     if (!hasDigit) {
         throw new InvalidPasswordException("Password must contain at least one digit (0-9).");
     }
     if (!hasSpecial) {
         throw new InvalidPasswordException("Password must contain at least one special character (@, #, $, %, etc.).");
     }
 }

 // Non editable starts here
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String password = scanner.nextLine();

     try {
         validatePassword(password);
         System.out.println("Password is valid.");
     } catch (InvalidPasswordException e) {
         System.out.println("Invalid Password: " + e.getMessage());
     }
 }
 // Non editable ends here
}