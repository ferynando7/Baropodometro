/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *


package Forms;


import Logic.ConnectionPostgres;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;


public class TablaDatos extends JFrame{
//Array de ‘String’ con los titulos de las columnas 
String[] columnNames = {"Cédula","Fecha Análisis","Nombre", "Apellido", "Género", "Fecha Nacimiento", "Altura", "Peso"};



Object[][] data = new Object[][]{};
//Creacion de la tabla 
final JTable table = new JTable(data, columnNames); 
table.setPreferredScrollableViewportSize(new Dimension(500, 80));

//Creamos un scrollpanel y se lo agregamos a la tabla 
JScrollPane scrollpane = new JScrollPane(table);

//Agregamos el scrollpanel al contenedor 
getContentPane().add(scrollpane, BorderLayout.CENTER);

//manejamos la salida 
addWindowListener(new WindowAdapter()) {

public void windowClosing(WindowEvent e) { 
System.exit(0); 
} 
}); 
}

public Object[][] loadData(){
    new Object[][] datos;
    
    String datoPaciente;
    String [] datosSplit;
    ConnectionPostgres newConnection = new ConnectionPostgres();
    ArrayList<String> datos = newConnection.recoverData();
    Iterator it = datos.iterator();
    while(it.hasNext()){
        datoPaciente = it.next().toString();
        datosSplit = datoPaciente.split(",");
            
        jTable1.addRow(new Object[]{datosSplit[0],datosSplit[1],datosSplit[1],datosSplit[1],datosSplit[1],datosSplit[1],datosSplit[1],datosSplit[1]});
            
}



public static void main(String ar[]) { 
SimpleTable1 frame = new SimpleTable1(); 
frame.pack(); 
frame.setVisible(true); 
} 
}

}

**/