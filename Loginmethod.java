/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginmethod;

/**
 *
 * @author Student
 */
public class Loginmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
        public class login {
    String savedUsername = "kyl_1";
    String savedPassword = "Ch&&sec@ke99!";
    String savedFirstName = "Kyle";
    String savedLastName = "Smith";

    public boolean checkUserName(String u) {
        if (u.contains("_") && u.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPasswordComplexity(String p) {
        boolean capital = false;
        boolean number = false;
        boolean special = false;
        
        if (!p.equals(p.toLowerCase())) capital = true;
        if (p.matches(".*\\d.*")) number = true;
        if (p.contains("!") || p.contains("@") || p.contains("#") || p.contains("$") || p.contains("%") || p.contains("^") || p.contains("&") || p.contains("*")) special = true;
        
        if (capital && number && special && p.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public String registerUser(String firstName, String lastName, String username, String password) {
        if (checkUserName(username) && checkPasswordComplexity(password)) {
            return "Registration successful";
        } else {
            return "Registration failed";
        }
    }

    public boolean loginUser(String username, String password) {
        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Welcome " + savedFirstName + " " + savedLastName;
        } else {
            return "Login failed - wrong username or password";
        }
    }
}
    }
    
