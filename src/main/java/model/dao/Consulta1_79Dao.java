package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta1_79Dao {
    public ArrayList<Consulta1VO_79> consulta1DAO() throws SQLException {

              
        Connection coneccion = JDBCUtilities.getConnection();
        Statement stmt = coneccion.createStatement();
        ResultSet c1 = stmt.executeQuery(
            "SELECT ID_Proyecto, Fecha_Inicio, Banco_Vinculado, Serial FROM Proyecto p WHERE ID_Proyecto > 4 AND ID_Proyecto < 12" );
        ArrayList <Consulta1VO_79> result = new ArrayList<Consulta1VO_79>();
        
        while (c1.next()){
            Consulta1VO_79 objeto = new Consulta1VO_79();
            objeto.setID_Proyecto(c1.getInt("ID_Proyecto"));
            objeto.setFecha_Inicio(c1.getString("Fecha_Inicio"));
            objeto.setBanco_Vinculado(c1.getString("Banco_Vinculado"));
            objeto.setSerial(c1.getString("Serial"));
            result.add(objeto);

        }
            
        return result;
                 
        
    }  
}
