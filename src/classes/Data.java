package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
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
    private int numInvoice = 0;

    public Data() {
        
        //load users
        loadUsers();
        
        //load products
        loadProducts();
        
        //load clients
        loadClients();
        
        //load configuration
        loadConfig();
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
    
    public int getProfile(String user) {
        for (int i = 0; i < userCounter; i++) {
            if (myUsers[i].getIdUser().equals(user)) {
                return myUsers[i].getProfile();
            }
        }
        return -1;
    }
    
    public void getChangePassword(String user, String password) {
        for (int i = 0; i < userCounter; i++) {
            if (myUsers[i].getIdUser().equals(user)) {
                myUsers[i].setPassword(password);
                return;
            }
        }
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
  
    public void recordAll(){
       recordUsers();
       recordProducts();
       recordClients();
       recordConfig();
    }
    
    public void  recordUsers(){
        FileWriter archive = null;
        PrintWriter  writeArchive = null;
        try {
            archive = new FileWriter("Data/users.txt");
            writeArchive = new PrintWriter(archive);
            for (int i = 0; i < userCounter; i++) {
               writeArchive.println(myUsers[i].toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
              if(archive != null){
                  archive.close();
              }  
            } catch (Exception ex) {
              ex.printStackTrace();  
            }
        }
    }
    public void  recordProducts(){
        FileWriter archive = null;
        PrintWriter  writeArchive = null;
        try {
            archive = new FileWriter("Data/products.txt");
            writeArchive = new PrintWriter(archive);
            for (int i = 0; i < productCounter; i++) {
               writeArchive.println(myProducts[i].toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
              if(archive != null){
                  archive.close();
              }  
            } catch (Exception ex) {
              ex.printStackTrace();  
            }
        }  
    }
    public void  recordClients(){
       FileWriter archive = null;
        PrintWriter  writeArchive = null;
        try {
            archive = new FileWriter("Data/clients.txt");
            writeArchive = new PrintWriter(archive);
            for (int i = 0; i < clientCounter; i++) {
               writeArchive.println(myClients[i].toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
              if(archive != null){
                  archive.close();
              }  
            } catch (Exception ex) {
              ex.printStackTrace();  
            }
        } 
    }
    
    public void  recordConfig(){
        FileWriter archive = null;
        PrintWriter  writeArchive = null;
        try {
            archive = new FileWriter("Data/config.ini");
            writeArchive = new PrintWriter(archive);
            
            writeArchive.println("[General]");
            writeArchive.println("InvoiceCurrent=" + numInvoice);
          
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
              if(archive != null){
                  archive.close();
              }  
            } catch (Exception ex) {
              ex.printStackTrace();  
            }
        }
    }
    
    public void loadUsers(){
        File archive = null;
        FileReader readFile = null;        
        BufferedReader readBuffered = null;
        
        try {
            archive = new File("Data/users.txt");
            readFile = new FileReader(archive);
            readBuffered = new BufferedReader(readFile);
            
            int position;
            String aux;
            String line;
            
            //Var user
            String idUser, name, lastName, password;
            int profile;
            
            while ((line = readBuffered.readLine()) != null) {  
                
                //we extract the user id
                position = line.indexOf('|');
                aux = line.substring(0, position);
                idUser = aux;
                line = line.substring(position + 1);
                
                //we extract the user name                
                position = line.indexOf('|');
                aux = line.substring(0, position);
                name = aux;
                line = line.substring(position + 1);
                
                //we extract the user lastname
                position = line.indexOf('|');
                aux = line.substring(0, position);
                lastName = aux;
                line = line.substring(position + 1);
                
                //we extract the user password and profile             
                position = line.indexOf('|');
                aux = line.substring(0, position);
                password = aux;
                line = line.substring(position + 1);
                profile = Integer.parseInt(line);
                
                //We create users
                User myUser;        
                myUser = new User(idUser, name, lastName, password, profile);
                myUsers[userCounter] = myUser;
                userCounter++;
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
               if(readFile != null){
                   readFile.close();
               } 
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void loadProducts(){
        File archive = null;
        FileReader readFile = null;        
        BufferedReader readBuffered = null;
        
        try {
            archive = new File("Data/products.txt");
            readFile = new FileReader(archive);
            readBuffered = new BufferedReader(readFile);
            
            int position;
            String aux;
            String line;
            
            //Var products
            String idProduct,description, note;
            int price, iva;

            //loop through flat file with divider "|"
            while ((line = readBuffered.readLine()) != null) {  
                
                //we extract the product id
                position = line.indexOf('|');
                aux = line.substring(0, position);
                idProduct = aux;
                line = line.substring(position + 1);
                
                //we extract the product description               
                position = line.indexOf('|');
                aux = line.substring(0, position);
                description = aux;
                line = line.substring(position + 1);
                
                //we extract the product price
                position = line.indexOf('|');
                aux = line.substring(0, position);
                price = Integer.parseInt(aux);
                line = line.substring(position + 1);
                
                //we extract the product iva
                position = line.indexOf('|');
                aux = line.substring(0, position);
                iva = Integer.parseInt(aux);
                line = line.substring(position + 1);
                note = line;
                
                //We create products
                Product myProduct;        
                myProduct = new Product(idProduct, description,price, iva, note);
                myProducts[productCounter] = myProduct;
                productCounter++;   
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
               if(readFile != null){
                   readFile.close();
               } 
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void loadClients(){
        File archive = null;
        FileReader readFile = null;        
        BufferedReader readBuffered = null;
        
        try {
            archive = new File("Data/clients.txt");
            readFile = new FileReader(archive);
            readBuffered = new BufferedReader(readFile);
            
            int position;
            String aux;
            String line;
            
            //Var clients
            String idClient,names, lastNames,address,phone;
            int idDocument, idCity;
            Date dayOfBirth,admissionDay;

            //loop through flat file with divider "|"
            while ((line = readBuffered.readLine()) != null) {  
                
                //we extract the client id
                position = line.indexOf('|');
                aux = line.substring(0, position);
                idClient = aux;
                line = line.substring(position + 1);
                
                //we extract the client idDocument              
                position = line.indexOf('|');
                aux = line.substring(0, position);
                idDocument = Integer.parseInt(aux);
                line = line.substring(position + 1);
                
                //we extract the client names
                position = line.indexOf('|');
                aux = line.substring(0, position);
                names = aux;
                line = line.substring(position + 1);
                
                //we extract the client lastNames
                position = line.indexOf('|');
                aux = line.substring(0, position);
                lastNames = aux;
                line = line.substring(position + 1);
                
                //we extract the client address
                position = line.indexOf('|');
                aux = line.substring(0, position);
                address = aux;
                line = line.substring(position + 1);
                
                //we extract the client phone
                position = line.indexOf('|');
                aux = line.substring(0, position);
                phone = aux;
                line = line.substring(position + 1);
                
                //we extract the client idCity
                position = line.indexOf('|');
                aux = line.substring(0, position);
                idCity = Integer.parseInt(aux);
                line = line.substring(position + 1);
                
                //we extract the client dayOfBirth and admissionDay
                position = line.indexOf('|');
                aux = line.substring(0, position);
                dayOfBirth = Utilities.stringToDate(aux);
                line = line.substring(position + 1);
                admissionDay=Utilities.stringToDate(line);
                

                //We create clients
                Client myClient;        
                myClient = new Client(idClient,idDocument ,names,lastNames, address,phone,
                        idCity,dayOfBirth,admissionDay);
                myClients[clientCounter] = myClient;
                clientCounter++;  
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
               if(readFile != null){
                   readFile.close();
               } 
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void loadConfig(){
        File archive = null;
        FileReader readFile = null;        
        BufferedReader readBuffered = null;
        
        try {
            archive = new File("Data/config.ini");
            readFile = new FileReader(archive);
            readBuffered = new BufferedReader(readFile);
            
            String line;
            
            //Traverse the line in width and assign a value after the line in this case 14
            while ((line = readBuffered.readLine()) != null) {  
                if(line.startsWith("InvoiceCurrent=")){
                    numInvoice = Integer.parseInt(line.substring(14));
                } 
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
               if(readFile != null){
                   readFile.close();
               } 
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
}
