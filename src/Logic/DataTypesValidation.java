/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author ferynando7
 */
public class DataTypesValidation {

    /*
    
    
     System.out.println("getTextID");
        NewPatient instance = new NewPatient();
        

        
        assertEquals("Exception 002", instance.getTextID("12345e"));
        assertEquals("Exception 002", instance.getTextID("12345"));
        assertEquals("Exception 003", instance.getTextID("1104136139"));
        assertEquals("1104136138", instance.getTextID("1104136138"));
       
    }

     */
 /*Validate IDs*/
    public String validateID(String id) {

        if (id.length() == 10) {
            if (isNumeric(id)) {

                if (codProvCorrect(id) && digVerifCorrect(id)) {
                    return id;
                } else {
                    return "Exception 003";
                }
            } else {
                return "Exception 001";
            }
        } else {
            return "Exception 002";
        }
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean codProvCorrect(String cadena) {
        String twoFirstDigits = cadena.substring(0, 1);
        int digits = Integer.parseInt(twoFirstDigits);
        if ((digits > 0 && digits < 25) || digits == 30) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean digVerifCorrect(String id) {
        int impar = 0;
        int par = 1;
        int sumaImpares = 0;
        int sumaPares = 0;
        int total;

        for (int i = impar; i < 9; i = i + 2) {
            int valueImpar = Character.getNumericValue(id.charAt(i)) * 2;

            if (valueImpar <= 10) {
                sumaImpares += valueImpar;
            } else {
                sumaImpares += valueImpar - 9;
            }
        }

        for (int i = par; i < 8; i = i + 2) {
            int valuePar = Character.getNumericValue(id.charAt(i));
            sumaPares += valuePar;
        }

        total = sumaImpares + sumaPares;

        if (10 - total % 10 == Character.getNumericValue(id.charAt(9))) {
            return true;
        } else {
            return false;
        }
    }

    /*Validate names/
    public String validateNames(String name) {

        name = name.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyzñáéíóú";
        int count = 0;

        if (name.isEmpty()) {
            return "The name cannot be null";
        } else {
            for (int i = 0; i < name.length(); i++) {
                if (alphabet.indexOf(name.charAt(i)) != -1) {
                    count++;
                }
            }

            if (count == name.length()) {
                return "ok";
            } else {
                return "Wrong name format";
            }
        }
    }

}
