/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part.pkg1.poe.prog;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PART1POEPROG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Welcome to The Registration Page");
        Scanner rc = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstName = rc.nextLine();
        
        System.out.println("Please enter your last name");
        String lastName = rc.nextLine();

        System.out.println("Please enter your username");
        String username = rc.nextLine();

        System.out.println("Please enter your password");
        String password = rc.nextLine();

        System.out.println("enter valid SA number (+27)");
        String phoneNumber = rc.nextLine();

         boolean usernameValid = false;
        if (username.length() <= 5 && username.contains("_")) {
            System.out.println("Username successfully captured");
            usernameValid = true;
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }

         boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean passwordValid = false;

        if (password.length() >= 8) {
            for (int x = 0; x < password.length(); x++) {
                char c = password.charAt(x);
                if (Character.isUpperCase(c)) {
                    hasUpper = true;
                }
                if (Character.isDigit(c)) {
                    hasDigit = true;
                }
                if (!Character.isLetterOrDigit(c)) {
                    hasSpecial = true;
                }
            }
        }

        if (password.length() >= 8 && hasUpper && hasDigit && hasSpecial) {
            System.out.println("Password successfully captured");
            passwordValid = true;
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
        }

       boolean phoneValid = false;
        if (phoneNumber.startsWith("+27") && phoneNumber.length() == 12) {
            System.out.println("Cellphone number successfully added");
            phoneValid = true;
        } else {
            System.out.println("Cellphone number is incorrectly formatted or does not contain international code.");
        }

         if (usernameValid && passwordValid && phoneValid) {
            System.out.println("User registered successfully.");

         
            System.out.println("\n--- Please Login ---");
            System.out.println("Enter your username to login");
            String loginUsername = rc.nextLine();
            
            System.out.println("Enter your password to login");
            String loginPassword = rc.nextLine();

            if (loginUsername.equals(username) && loginPassword.equals(password)) {
                System.out.println("Welcome " + firstName + ", " + lastName + " it is great to see you again.");
            } else {
                System.out.println("Username or password incorrect, please try again.");
            }
        } else {
            System.out.println("Registration failed. Please fix the errors above.");
        }
        
        rc.close();
    }
}
       
    
    
    
    

