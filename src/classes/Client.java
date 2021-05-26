
package classes;

import java.util.Date;

public class Client {
    private String idClient;
    private int idDocument;
    private String names;
    private String lastNames;
    private String address;
    private String phone;
    private int idCity;
    private Date dayOfBirth;
    private Date admissionDay;

    public Client(String idClient, int idDocument, String names, 
            String lastNames, String address, String phone, int idCity, 
            Date dayOfBirth, Date admissionDay) {
        this.idClient = idClient;
        this.idDocument = idDocument;
        this.names = names;
        this.lastNames = lastNames;
        this.address = address;
        this.phone = phone;
        this.idCity = idCity;
        this.dayOfBirth = dayOfBirth;
        this.admissionDay = admissionDay;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Date getAdmissionDay() {
        return admissionDay;
    }

    public void setAdmissionDay(Date admissionDay) {
        this.admissionDay = admissionDay;
    }
}
