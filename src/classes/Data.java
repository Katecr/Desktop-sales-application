package classes;

public class Data {
    public boolean validateUser(String user, String password){
        if(user.equals("kate")&& password.equals("123456")){
            return true;
        }else {
            return false;
        }
    }
}
