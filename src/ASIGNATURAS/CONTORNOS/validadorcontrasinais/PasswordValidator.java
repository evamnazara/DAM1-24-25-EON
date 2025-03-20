package validadorcontrasinais;

public class PasswordValidator {
    public static boolean isValid(String password) {
        if (password.length() <= 8) { 
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) { //original Character.isLowerCase
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) { 
                hasDigit=true; //original hasDigit=false 
            }
        }
        return hasUpperCase || hasDigit; 
    }
}

