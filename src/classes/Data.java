package classes;

public class Data {

    private int maxUser = 50;
    private int maxProducts = 100;
    private User myUsers[] = new User[maxUser];
    private Product myProducts[] = new Product[maxProducts];
    private int userCounter = 0;
    private int productCounter = 0;

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
        for (int i = 0; i < userCounter; i++) {
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

  
}
