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

public class Consulta3_79Dao {
    public ArrayList<Consulta3VO_79> consulta3DAO() throws SQLException {
  
        
        Connection coneccion = JDBCUtilities.getConnection();
        Statement stmt = coneccion.createStatement();
        ResultSet c3 = stmt.executeQuery("SELECT ID_Proyecto, l.Nombre || ' ' || l.Primer_Apellido as nom_ape FROM Proyecto p JOIN Lider l ON l.ID_Lider = p.ID_Lider WHERE p.Banco_Vinculado = 'Colpatria'");
        ArrayList <Consulta3VO_79> result = new ArrayList<Consulta3VO_79>();
        while (c3.next()) {
            Consulta3VO_79 objeto = new Consulta3VO_79();
            objeto.setID_Proyecto(c3.getInt("ID_Proyecto"));
            objeto.setNom_ape(c3.getString("nom_ape"));
            result.add(objeto);
        }

        
        return result;
        
    }  
}
