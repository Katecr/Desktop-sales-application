package classes;

public class User {
    private String idUser, name, lastName, password;
    private int profile;

    public User(String idUser, String name, String lastName, String password, int profile) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.profile = profile;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

   
    
}
