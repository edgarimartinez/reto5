package controller;

import java.sql.SQLException;
//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.*;
import model.vo.*;

//Bibliotecas para bases de datos
// import java.sql.SQLException;

public class ControladorRequerimientosReto5_79 {       
    Consulta1_79Dao consultor; 
    public ArrayList<Consulta1VO_79>realizarConsulta1() throws SQLException{
        
            consultor = new Consulta1_79Dao();
            return consultor.consulta1DAO();
                
    }
    
    public ArrayList<Consulta2VO_79>realizarConsulta2() throws SQLException{
        
            Consulta2_79Dao consultor = new Consulta2_79Dao();
            return consultor.consulta2DAO();
        
    }

    public ArrayList<Consulta3VO_79>realizarConsulta3() throws SQLException{
        
            Consulta3_79Dao consultor = new Consulta3_79Dao();
            return consultor.consulta3DAO();
       
    }
}


