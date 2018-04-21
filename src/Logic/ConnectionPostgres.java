/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author USER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConnectionPostgres {

    public ConnectionPostgres() {
    }

    /*Funcion que se encarga de realizar la conexión a la base de datos*/
    public Connection connectDB() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost/Baropodometro",
                            "postgres", "1234");
        } catch (Exception e) {
            String error = ((new DBExceptions()).conexionError() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println("Opened database successfully");
        return c;
    }

    /*Funcion que se encarga de insertar los datos en la tabla paciente, recibe 
    como parametros los valores de los campos a insertar*/
    public void insertData(String values) {
        //values debe estar en el formato correspondiente SQL

        Connection c;
        Statement stmt = null;
        try {
            c = connectDB();
            stmt = c.createStatement();
            String sql = "INSERT INTO patient (id,firstName,lastName,genre,birthdate,heigth,weight,phone,email)"
                    + "VALUES (" + values + ");";
            stmt.executeUpdate(sql);
            stmt.close();
            c.setAutoCommit(false);
            c.commit();
            c.close();
        } catch (Exception e) {
            String error = ((new DBExceptions()).insertionError() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        String success = "Patient record created successfully";
        JOptionPane.showMessageDialog(null, success , "Great!", JOptionPane.INFORMATION_MESSAGE);
    }

    
     public void updateData(String values) {
        //values debe estar en el formato correspondiente SQL
        String[] datosSplit = values.split(",");
        Connection c;
        Statement stmt = null;
        try {
            c = connectDB();
            stmt = c.createStatement();
            String sql = "UPDATE patient set firstName = " + datosSplit[1] + ",lastName = " + datosSplit[2] + ",genre = " + datosSplit[3] + ",birthdate = " + datosSplit[4] + "," + datosSplit[5] + ",heigth  = " + datosSplit[6] + ",weight = " + datosSplit[7] + ",phone = " + datosSplit[8] + ",email = " + datosSplit[9] + " where id = " + datosSplit[0];
            stmt.executeUpdate(sql);
            stmt.close();
            c.setAutoCommit(false);
            c.commit();
            c.close();
        } catch (Exception e) {
            String error = ((new DBExceptions()).insertionError() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        String success = "Patient information updated successfully";
        JOptionPane.showMessageDialog(null, success , "Great!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
    /*Funcion que se encarga de recuperar los registros de la tabla paciente*/
    public ArrayList<String> recoverData() {
        Connection c;

        Statement stmt = null;
        ArrayList<String> datos = new ArrayList<String>();
        String datoPaciente;
        try {
            c = connectDB();
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM patient;");

            while (rs.next()) {
                String cedula = rs.getString("id");
                String nombre = rs.getString("firstName");
                String apellido = rs.getString("lastName");
                String genero = rs.getString("genre");
                String fechNac = rs.getString("birthdate");
                String altura = rs.getString("heigth");
                String peso = rs.getString("weight");

                datoPaciente = cedula + "," + "," + nombre + "," + apellido + "," + genero + "," + fechNac + "," + altura + "," + peso;

                datos.add(datoPaciente);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            String error = ((new DBExceptions()).obtainingError() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }
    
    
    public String recoverPatient(String id) {
        Connection c;

        Statement stmt = null;
        String datoPaciente = "";
        try {
            c = connectDB();
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM patient WHERE id =" + "'" + id + "';");
            rs.next();
            String cedula = rs.getString("id");
            String nombre = rs.getString("firstName");
            String apellido = rs.getString("lastName");
            String genero = rs.getString("genre");
            String fechNac = rs.getString("birthdate");
            String altura = rs.getString("heigth");
            String peso = rs.getString("weight");

            datoPaciente = cedula + "," + nombre + "," + apellido + "," + genero + "," + fechNac + "," + altura + "," + peso;
            
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            String error = ((new DBExceptions()).obtainingError() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return datoPaciente;
    }

    

    /*Funcion que se encarga de eliminar un registro de la tabla paciente,
    para borrar se debe pasar como parametro la cedula del paciente y la fecha de analisis*/
    public void deleteRegister(String cedula) {

        Connection c;
        Statement stmt = null;
        try {
            c = connectDB();
            stmt = c.createStatement();
            String sql = "DELETE from patient where id = '" + cedula + "';";
            stmt.executeUpdate(sql);
            c.setAutoCommit(false);
            c.commit();
            stmt.close();
            c.close();
        } catch (Exception e) {
            String error = ((new DBExceptions()).deletingError() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        String success = "Patient deleted successfully";
        JOptionPane.showMessageDialog(null, success , "Great!", JOptionPane.INFORMATION_MESSAGE);

    }

}
