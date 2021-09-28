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

public class Consulta2_79Dao {
    public ArrayList<Consulta2VO_79> consulta2DAO() throws SQLException {
     
        Connection coneccion = JDBCUtilities.getConnection();
        Statement stmt = coneccion.createStatement();
        ResultSet c2 = stmt.executeQuery(
            "SELECT Nombre, Salario, Salario*0.08 as deducible, Primer_Apellido || '-' || Segundo_Apellido as apellidos FROM Lider l WHERE Salario BETWEEN 500000 AND 650000");
        ArrayList <Consulta2VO_79> result = new ArrayList<Consulta2VO_79>();
        while(c2.next()){
            Consulta2VO_79 objeto = new Consulta2VO_79();
            objeto.setNombre(c2.getString("Nombre"));
            objeto.setSalario(c2.getInt("Salario"));
            objeto.setDeducible(c2.getDouble("deducible"));
            objeto.setApellidos(c2.getString("apellidos"));
            result.add(objeto);

        }
           
    return result;
    }  
}
