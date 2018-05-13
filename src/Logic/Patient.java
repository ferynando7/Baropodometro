/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author root
 */
public class Patient {
    
    private String id, firstName, lastName, genre, birthDate, phone, email, height, weight;

    public Patient(String id, String height, String firstName, String lastName, String genre, String birthDate, String phone, String email, String weight) {
        this.id = id;
        this.height = height;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(double String) {
        this.weight = weight;
    }
    
    
    
    public void savePatient(){
        
        String values = "'" + id +  "','" + firstName + "','" + lastName + "','" + genre + "','" + birthDate + "'," + height + "," + weight + ", ' ' , ' '";

        ConnectionPostgres newConnection = new ConnectionPostgres();
        System.out.println(values);

        newConnection.insertData(values);

        
    }
    
    
}
