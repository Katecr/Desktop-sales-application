
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    public static boolean isNumeric(String price){
        try{
            Integer.parseInt(price);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }
    
    public static Date stringToDate(String date){
       SimpleDateFormat formatOfText = new SimpleDateFormat("yyyy/MM/dd");
       Date aux = null;
        try {
            aux = formatOfText.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }
    
    public static String formatDate(Date date){
        SimpleDateFormat formatOfText = new SimpleDateFormat("yyyy/MM/dd");
        return formatOfText.format(date);
    }
}
