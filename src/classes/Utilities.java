
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
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
    
    public static int objectToInt(Object Obj) {
        int NumInt = Integer.parseInt(objectToString(Obj));
        return NumInt;
    }

    public static double objectToDouble(Object Obj) {
        String Str = Obj.toString();
        double NumDouble = Double.valueOf(Str).doubleValue();
        return NumDouble;
    }

    public static boolean objectToBoolean(Object Obj) {
        String CadBooleana = objectToString(Obj);
        Boolean booleano = new Boolean(CadBooleana);
        return booleano;
    }

    public static String objectToString(Object Obj) {
        String Str = "";
        if (Obj != null) {
            Str = Obj.toString();
        }
        return Str;
    }
}
