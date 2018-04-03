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
/**    public static void main(String[] args) {
      
        String input = "'Fernando','Zhapa'";
        insertData(input);
        recoverData();
    }
   **/ 
    
    public ConnectionPostgres(){};
    
    
    public Connection connectDB(){
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
            .getConnection("jdbc:postgresql://192.168.1.5:5432/baropodometro",
            "postgres", "1234");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        
        System.out.println("Opened database successfully");
        return c;
    }
    
    public void insertData(String values){
        /**
         values debe estar en el formato correspondiente SQL
         
         **/
        
        Connection c;
        Statement stmt = null;
        try {
            c = connectDB();
            stmt = c.createStatement();
            String sql = "INSERT INTO paciente (cedula,fechanalisis ,NOMBRE,APELLIDO, genero,fechnac,altura,peso) "
            + "VALUES ("+values +");";
            stmt.executeUpdate(sql);
            stmt.close();
            c.setAutoCommit(false);
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
    
    
    public ArrayList<String> recoverData(){
        Connection c;
        
        Statement stmt = null;
        ArrayList<String> datos = new ArrayList<String>();
        String datoPaciente; 
        try {
            c = connectDB();
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM paciente;" );
           
            while ( rs.next() ) {
                String cedula = rs.getString("cedula");
                String fechaAnalisis = rs.getString("fechAnalisis");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String genero = rs.getString ("genero");
                String fechNac = rs.getString ("fechNac");
                String altura = rs.getString ("altura");
                String peso = rs.getString ("peso");
                
                datoPaciente = cedula + "," + fechaAnalisis + "," + nombre + "," + apellido + "," + genero + "," + fechNac + "," + altura + "," + peso;
                
                datos.add(datoPaciente);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        return datos;
    }
    
    public void deleteRegister(String cedula, String fechAnalisis){
    
     Connection c;
      Statement stmt = null;
      try {
         c = connectDB();
         stmt = c.createStatement();
         String sql = "DELETE from paciente where cedula = '" + cedula + "' and fechanalisis = '" + fechAnalisis + "';";
         stmt.executeUpdate(sql);
         c.setAutoCommit(false);
         c.commit();
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
      System.out.println("Operation done successfully");
    
    }
    
}