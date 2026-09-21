/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logintest;

/**
 *
 * @author Student
 */

    /**
     */
public class LoginTest {

    // Check username - must have _ and max 5 chars
    public static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Check password - 8 chars, capital, number, special char
    public static boolean checkPasswordComplexity(String password) {
        boolean hasCapital = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*].*");
        boolean hasLength = password.length() >= 8;
        return hasCapital && hasNumber && hasSpecial && hasLength;
    }

    // Login check
    public static boolean loginUser(String username, String password) {
        String savedUser = "kyl_1";
        String savedPass = "Ch&&sec@ke99!";
        return username.equals(savedUser) && password.equals(savedPass);
    }

    public static void main(String[] args) {
        System.out.println("=== LOGIN TESTS ===");
        System.out.println("");

        System.out.println("Test 1: kyl_1 valid? " + checkUserName("kyl_1") + " -> Should be true = PASSED");
        System.out.println("Test 2: kyle!!!!!!! valid? " + checkUserName("kyle!!!!!!!") + " -> Should be false = PASSED");
        System.out.println("");
        System.out.println("Test 3: Ch&&sec@ke99! valid? " + checkPasswordComplexity("Ch&&sec@ke99!") + " -> Should be true = PASSED");
        System.out.println("Test 4: password valid? " + checkPasswordComplexity("password") + " -> Should be false = PASSED");
        System.out.println("");
        System.out.println("Test 5: Login kyl_1 / Ch&&sec@ke99! = " + loginUser("kyl_1", "Ch&&sec@ke99!") + " -> PASSED");
        System.out.println("Test 6: Login kyl_1 / wrong = " + loginUser("kyl_1", "wrong") + " -> Should be false = PASSED");
        
        System.out.println("");
        System.out.println("=== ALL TESTS DONE ===");
        if (loginUser("kyl_1", "Ch&&sec@ke99!")) {
            System.out.println("Welcome Kyle Smith it is great to see you again.");
        }
    }
}
  


