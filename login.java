/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part.pkg1.poe.prog;

import java.util.Scanner;

/**
 *
 * @author Student
 */

public class PART1POEPROG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LogIn user = new LogIn();

        System.out.println("=== REGISTER ===");
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Enter Username (must contain _ and max 5 chars): ");
        String username = input.nextLine();
        System.out.print("Enter Password (8 chars, capital, number, special): ");
        String password = input.nextLine();

        String msg = user.registerUser(firstName, lastName, username, password);
        System.out.println(msg);

        if (msg.equals("User registered successfully.")) {
            System.out.println("\n=== LOGIN ===");
            System.out.print("Enter Username: ");
            String loginUser = input.nextLine();
            System.out.print("Enter Password: ");
            String loginPass = input.nextLine();
            System.out.println(user.returnLoginStatus(loginUser, loginPass));
        }
        input.close();
    }
}

class LogIn {
    String savedUsername;
    String savedPassword;
    String savedFirstName;
    String savedLastName;

    public boolean checkUserName(String u) {
        return u.contains("_") && u.length() <= 5;
    }
    public boolean checkPasswordComplexity(String p) {
        return !p.equals(p.toLowerCase()) && p.matches(".*\\d.*") && p.matches(".*[!@#$%^&*()_+\\-={}:;<>?].*") && p.length() >= 8;
    }
    public String registerUser(String fn, String ln, String u, String p) {
        if (!checkUserName(u)) return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        if (!checkPasswordComplexity(p)) return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        savedFirstName = fn; savedLastName = ln; savedUsername = u; savedPassword = p;
        return "User registered successfully.";
    }
    public boolean loginUser(String u, String p) {
        return u.equals(savedUsername) && p.equals(savedPassword);
    }
    public String returnLoginStatus(String u, String p) {
        if (loginUser(u, p)) return "Welcome " + savedFirstName + " " + savedLastName + " it is great to see you again.";
        else return "Username or password incorrect, please try again.";
    }
}
    
