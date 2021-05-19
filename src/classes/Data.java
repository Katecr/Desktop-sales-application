package classes;

public class Data {

    private int maxUser = 50;
    private User myUsers[] = new User[maxUser];
    private int userCounter = 0;

    public Data() {
        User myUser;

        myUser = new User("kate", "Kate", "Castaño Rueda", "123456", 1);
        myUsers[userCounter] = myUser;
        userCounter++;
        myUser = new User("pepe", "Pedro", "Infante", "123", 2);
        myUsers[userCounter] = myUser;
        userCounter++;
        myUser = new User("maria", "Maria", "Taborda", "123", 2);
        myUsers[userCounter] = myUser;
        userCounter++;
        myUser = new User("lucho", "Luis", "Perez", "123", 2);
    }

    public User[] getUsers() {
        return myUsers;
    }

    public boolean validateUser(String user, String password) {
        boolean aux = false;
        for (int i = 0; i < userCounter; i++) {
            if (myUsers[i].getIdUser().equals(user) && myUsers[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public int userPosition(String user) {
        for (int i = 0; i < userCounter; i++) {
            if (myUsers[i].getIdUser().equals(user)) {
                return i;
            }
        }
        return -1;
    }

    public String addUser(User myUser) {
        if (userCounter == maxUser) {
            return "Se ha alcanzado el número máximo de usuarios";
        }

        myUsers[userCounter] = myUser;
        userCounter++;
        return "Usuario agregado correctamente";
    }

    public int numberUsers() {
        return userCounter;
    }

    public String editUser(User myUser, int position) {
        myUsers[position].setName(myUser.getName());
        myUsers[position].setLastName(myUser.getLastName());
        myUsers[position].setPassword(myUser.getPassword());
        myUsers[position].setProfile(myUser.getProfile());
        return "Usuario modificado correctamente";
    }

    public String deleteUser(int position) {
        for (int i = position; i < userCounter - 1; i++) {
            myUsers[i] = myUsers[i + 1];
        }
        userCounter--;
        return "Usuario elimiando correctamente";
    }
}
