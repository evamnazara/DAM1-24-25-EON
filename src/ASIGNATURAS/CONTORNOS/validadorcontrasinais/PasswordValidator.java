package ASIGNATURAS.CONTORNOS.validadorcontrasinais;
/*
    POR ENUNCIADO: 
        Ten polo menos 8 caracteres.
        Contén polo menos unha letra maiúscula.
        Contén polo menos un número.
 */

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

