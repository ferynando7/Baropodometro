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



    /*Validacion de la cédula*/

    public String validateID(String id){

        if (!id.isEmpty()){
            if (isNumeric(id)){
                if (id.length()==10){

                    if(codProvCorrect(id) && digVerifCorrect(id) ){
                        return id;
                    }else{
                        return "Exception 003";
                    }
                }else{
                    return "Exception 002";
                }
            }else{
                return "Exception 001";
            }
        }else{
            return "Exception 005";
        }
    }

        /* Validación de enteros*/
        public String validateIntegers(String height, int limit) {
            
            if (!height.isEmpty()){
                if(isNumeric(height)) {
                    if(Integer.parseInt(height)>0 && Integer.parseInt(height)<=limit) {
                        return height;
                    } else {
                        return "Exception 006";
                    }
                }
                return "Exception 007";
            }else{
                return "Exception 005";
            }
        }

    /*Se valida si un string es numerico*/
    private static boolean isNumeric(String cadena){
        try{
            Integer.parseInt(cadena);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }

    /*Dado un string se valida que los dos primeros digitos correspondan al
    codigo de una provincia de Ecuador, o que pertenezca a una persona extranjera
    que posee numero de cedula*/
    private static boolean codProvCorrect(String cadena){
        String twoFirstDigits = cadena.substring(0,1);
        int digits = Integer.parseInt(twoFirstDigits);
        if((digits>0 && digits<25) || digits == 30){
            return true;
        }else{
            return false;
        }
    }

    /*Dado un string se valida que el ultimo digito cumpla las reglas de verificacion
    que todo numero de cedula ecuatoriana debe cumplir.*/
    private static boolean digVerifCorrect(String id){
        int impar = 0;
        int par = 1;
        int sumaImpares=0;
        int sumaPares=0;
        int total;

        for (int i = impar; i < 9;i=i+2){
            int valueImpar = Character.getNumericValue(id.charAt(i))*2;

            if(valueImpar <10){
                sumaImpares+= valueImpar;
            }else{
                sumaImpares+=valueImpar -9;
            }
        }

        for (int i = par; i<8;i=i+2 ){
            int valuePar = Character.getNumericValue(id.charAt(i));
             sumaPares += valuePar;
        }

        total = sumaImpares+sumaPares;

        if(10-total%10 == Character.getNumericValue(id.charAt(9))) return true;
        else return false;
    }



/*Validación de doubles*/

    public String validateDouble(String peso){

        if (!peso.isEmpty()){
            if (isDouble(peso)){
                double pesoenDouble=Double.parseDouble(peso);
                if(pesoenDouble>0){
                   return peso;
                }else{
                    return "Exception 008";
                           }
            }else{
                 return "Exception 004";
            }
        }else{
            return "Exception 005";
        }

    }

    private static boolean isDouble(String peso){
        try{
            Double.parseDouble(peso);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }

    }


    /*Validate names*/
    /*This function checks if the name or last name contains only characters
    that are in the alphabet because a name or lastname cannot have numbers
    or symbols*/
    public String validateNames(String name) {

        String aux = name;
        name = name.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyzñáéíóú";
        int count = 0;

        if (name.isEmpty()) {
            return "Exception 005";
        } else {
            for (int i = 0; i < name.length(); i++) {
                if (alphabet.indexOf(name.charAt(i)) != -1) {
                    count++;
                }
            }

            if (count == name.length()) {
                return aux;
            } else {
                return "Exception 009";
            }
        }
    }
    
    public String validateDate(String date) {

        if (date.isEmpty()) {
            return "Exception 005";
        }else{
            return date;
        }
    }

}
