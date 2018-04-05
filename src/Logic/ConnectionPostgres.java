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

public class ConnectionPostgres {

    public ConnectionPostgres() {
    }

    /*Funcion que se encarga de realizar la conexión a la base de datos*/
    public Connection connectDB() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost/baropodometro",
                            "carlos", "1234");
        } catch (Exception e) {
            System.err.println((new DBExceptions()).conexionError() + ": " + e.getMessage());
            System.exit(0);
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
            String sql = "INSERT INTO patient (id,firstName,lastName,genre,fecNac,altura,peso,fecha_analisis) "
                    + "VALUES (" + values + ");";
            stmt.executeUpdate(sql);
            stmt.close();
            c.setAutoCommit(false);
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println((new DBExceptions()).insertionError() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");
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
                String fechaAnalisis = rs.getString("fecha_analisis");
                String nombre = rs.getString("firstName");
                String apellido = rs.getString("lastName");
                String genero = rs.getString("genre");
                String fechNac = rs.getString("fecNac");
                String altura = rs.getString("altura");
                String peso = rs.getString("peso");

                datoPaciente = cedula + "," + fechaAnalisis + "," + nombre + "," + apellido + "," + genero + "," + fechNac + "," + altura + "," + peso;

                datos.add(datoPaciente);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println((new DBExceptions()).obtainingError() + ": " + e.getMessage());
            System.exit(0);
        }
        return datos;
    }

    /*Funcion que se encarga de eliminar un registro de la tabla paciente,
    para borrar se debe pasar como parametro la cedula del paciente y la fecha de analisis*/
    public void deleteRegister(String cedula, String fechAnalisis) {

        Connection c;
        Statement stmt = null;
        try {
            c = connectDB();
            stmt = c.createStatement();
            String sql = "DELETE from patient where id = '" + cedula + "' and fecha_analisis = '" + fechAnalisis + "';";
            stmt.executeUpdate(sql);
            c.setAutoCommit(false);
            c.commit();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println((new DBExceptions()).deletingError() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");

    }

}
