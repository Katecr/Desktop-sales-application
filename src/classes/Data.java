package classes;

public class Data {
    private User myUsers[] = new User[50];
    private int userCounter=0;
    
    public Data(){
       User myUser = new User("kate", "Kate", "Castaño Rueda", "123456", 1);
       myUsers[userCounter] = myUser;
       userCounter++;
    }
    
    public User[] getUsers() {
        return myUsers;
    }
    public boolean validateUser(String user, String password){
       boolean aux = false;
        for (int i = 0; i < userCounter; i++) {
            if(myUsers[i].getIdUser().equals(user) && myUsers[i].getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
