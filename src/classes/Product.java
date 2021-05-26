package classes;

public class Product {
    private String idProduct;
    private String description;
    private int price;
    private int iva; // 0=0%, 1=10%, 2=19%
    private String note;

    public Product(String idProduct, String description, int price, int iva, String note) {
        this.idProduct = idProduct;
        this.description = description;
        this.price = price;
        this.iva = iva;
        this.note = note;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    @Override
    public String toString() {
        return idProduct + "|"+
                description + "|"+
                price + "|"+
                iva + "|"+
                note; 
    } 
}
