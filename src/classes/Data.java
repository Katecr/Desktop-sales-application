package classes;

public class Data {
    private int maxUser = 50;
    private User myUsers[] = new User[maxUser];
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
    
    public int userPosition(String user){       
        for (int i = 0; i < userCounter; i++) {
            if(myUsers[i].getIdUser().equals(user)){
                return i;
            }
        }
        return -1;
    }
    
    public String addUser(User myUser){
        if(userCounter == maxUser){
            return "Se ha alcanzado el número máximo de usuarios";
        }
        
        myUsers[userCounter] = myUser;
        userCounter++;
        return "Usuario agregado correctamente";
    }
    
}
