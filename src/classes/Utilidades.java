
package classes;

public class Utilidades {
    public static boolean isNumeric(String price){
        try{
            Integer.parseInt(price);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }
}
