package classes;

import java.util.Date;

public class Data {

    private int maxUser = 50;
    private int maxProducts = 100;
    private int maxClients = 100;
    private User myUsers[] = new User[maxUser];
    private Product myProducts[] = new Product[maxProducts];
    private Client myClients [] = new Client[maxClients];
    private int userCounter = 0;
    private int productCounter = 0;
    private int clientCounter = 0;

    public Data() {
        
        //We create users
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
        
        //We create products
        Product myProduct;        
        myProduct = new Product("1", "Coca-Cola",1200, 0, "");
        myProducts[productCounter] = myProduct;
        productCounter++;
        myProduct = new Product("2", "Pan de leche",800, 1, "se venden mejor caliente");
        myProducts[productCounter] = myProduct;
        productCounter++;
        myProduct = new Product("3", "Salchichon Zanu x 500gr",3500, 2, "Recomendado con pan");
        myProducts[productCounter] = myProduct;
        productCounter++;
        
        //We create clients
        Client myClient;        
        myClient = new Client("1", 1 ,"Juan Carlos","Torres Marin", "Calle luna calle sol","2335896",
                1,Utilidades.stringToDate("1974/09/23"),Utilidades.stringToDate("2012/12/10") );
        myClients[clientCounter] = myClient;
        clientCounter++;
        myClient = new Client("2", 1 ,"Ledys","Bedoya", "Avenida la felicidad","5225566",
                10,Utilidades.stringToDate("1981/01/11"),Utilidades.stringToDate("2010/06/16") );
        myClients[clientCounter] = myClient;
        clientCounter++;
        myClient = new Client("3", 1 ,"Rufino","Aristizabal", "Carrera los angeles","8563214",
                2,Utilidades.stringToDate("1978/07/17"),Utilidades.stringToDate("2016/08/25") );
        myClients[clientCounter] = myClient;
        clientCounter++;
        
    }
    //user methods
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
    
    //products methods
    public Product[] getProducts() {
        return myProducts;
    }

    public int numberProducts() {
        return productCounter;
    }
    
    public int productPosition(String product) {
        for (int i = 0; i < productCounter; i++) {
            if (myProducts[i].getIdProduct().equals(product)) {
                return i;
            }
        }
        return -1;
    }

    public String addProduct(Product myProduct) {
        if (productCounter == maxProducts) {
            return "Se ha alcanzado el número máximo de productos";
        }

        myProducts[productCounter] = myProduct;
        productCounter++;
        return "Producto agregado correctamente";
    }
    
    public String editProduct(Product myProduct, int position) {        
        myProducts[position].setDescription(myProduct.getDescription());
        myProducts[position].setPrice(myProduct.getPrice());
        myProducts[position].setIva(myProduct.getIva());
        myProducts[position].setNote(myProduct.getNote());
        return "Producto modificado correctamente";
    }

    public String deleteProduct(int position) {
        for (int i = position; i < productCounter - 1; i++) {
            myProducts[i] = myProducts[i + 1];
        }
        productCounter--;
        return "Producto elimiando correctamente";
    }
    
     //clients methods
    public Client[] getClients() {
        return myClients;
    }

    public int clientPosition(String client) {
        for (int i = 0; i < clientCounter; i++) {
            if (myClients[i].getIdClient().equals(client)) {
                return i;
            }
        }
        return -1;
    }

    public String addClient(Client myClient) {
        if (clientCounter == maxClients) {
            return "Se ha alcanzado el número máximo de clientes";
        }

        myClients[clientCounter] = myClient;
        clientCounter++;
        return "Cliente agregado correctamente";
    }

    public int numberClients() {
        return clientCounter;
    }

    public String editClient(Client myClient, int position) {
        myClients[position].setIdDocument(myClient.getIdDocument());
        myClients[position].setNames(myClient.getNames());
        myClients[position].setLastNames(myClient.getLastNames());
        myClients[position].setAddress(myClient.getAddress());
        myClients[position].setPhone(myClient.getPhone());
        myClients[position].setIdCity(myClient.getIdCity());
        myClients[position].setDayOfBirth(myClient.getDayOfBirth());
        myClients[position].setAdmissionDay(myClient.getAdmissionDay());
        return "Cliente modificado correctamente";
    }

    public String deleteClient(int position) {
        for (int i = position; i < clientCounter - 1; i++) {
            myClients[i] = myClients[i + 1];
        }
        clientCounter--;
        return "Cliente elimiando correctamente";
    }
  
}
