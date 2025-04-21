package com.ragnar;

public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Zapkto9@0";
        System.out.println("Password Validated: " + isValidPassword(password));
    }

    private static boolean isValidPassword(String password) {
        boolean digitFlag = false;
        boolean upperCaseFlag = false;
        boolean lowerCaseFlag = false;
        boolean specialCharFlag = false;

        if (password.length() >= 8) {
            for(char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
//                    System.out.println("Digit detected");
                    digitFlag = true;
                }
                else if (Character.isUpperCase(c)) {
//                    System.out.println("Upper Case Character Detected");
                    upperCaseFlag = true;
                }
                else if (Character.isLowerCase(c)) {
//                    System.out.println("Lower Case Character Detected");
                    lowerCaseFlag = true;
                }
                else {
//                    System.out.println("Special Character Detected");
                    specialCharFlag = true;
                }
            }
        }
        return digitFlag && upperCaseFlag && lowerCaseFlag && specialCharFlag;
    }
}
