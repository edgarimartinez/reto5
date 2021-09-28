package view;

import controller.*;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Consumer;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class VistaRequerimientosReto5_79 extends JFrame {
    
    public Container panelContenido =null;

    public static final ControladorRequerimientosReto5_79 controlador = new ControladorRequerimientosReto5_79();
    // private static Consumer<? super Consulta2VO_79> action;


    public static void consulta1(){
        System.out.println("-----Consulta 1-------"); 
        try{
            VistaRequerimientosReto5_79 jframe = new VistaRequerimientosReto5_79();
            ArrayList<Consulta1VO_79> lista = controlador.realizarConsulta1();
            
            jframe.initializeJFrame(lista);
            //Encabezado del resultado
            //Cada VO cargado, mostrarlo en la vista
            jframe.setVisible(true);
           
        
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Ha ocurrido un error!");
        }      
    }

    public static void consulta2(){
        System.out.println("-----Consulta 2-------"); 
        try{
            VistaRequerimientosReto5_79 jframe2 = new VistaRequerimientosReto5_79();
            ArrayList<Consulta2VO_79> lista = controlador.realizarConsulta2();
            jframe2.initializeJFrame2(lista);
    //         // Encabezado del resultado
    //         // Cada VO cargado, mostrarlo en la vista
            jframe2.setVisible(true);
            


        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!");
        }      
    }


    public static void consulta3(){
        System.out.println("-----Consulta 3-------"); 
        try{
            VistaRequerimientosReto5_79 jframe3 = new VistaRequerimientosReto5_79();
            ArrayList<Consulta3VO_79> lista = controlador.realizarConsulta3();
            jframe3.initializeJFrame3(lista);
            //Encabezado del resultado             
            //Cada VO cargado, mostrarlo en la vista
            jframe3.setVisible(true);
            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!");
        }      
    }

    public void initializeJFrame(ArrayList<Consulta1VO_79>lista){
        this.setTitle("Consulta 1");
        this.panelContenido = this.getContentPane();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(new FlowLayout());
        Object [][] arrayInicial = new Object[lista.size()][];
        Integer contador = 0;
        for (Object object : arrayInicial){
            arrayInicial[contador]= new Object[]{
                lista.get(contador).getID_Proyecto(),
                lista.get(contador).getFecha_Inicio(),
                lista.get(contador).getBanco_Vinculado(),
                lista.get(contador).getSerial(),
            };
            contador++;
        }
        JTable tabla = new JTable(arrayInicial, new Object[]{"ID_Proyecto","Fecha_Inicio","Banco_Vinculado","Serial"});
        JScrollPane panel = new JScrollPane(tabla);
        panel.setSize(600, 600);
        this.panelContenido.add(panel);
    }

    public void initializeJFrame2(ArrayList<Consulta2VO_79>lista){
        this.setTitle("Consulta 2");
        this.panelContenido = this.getContentPane();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(new FlowLayout());
        Object [][] arrayInicial = new Object[lista.size()][];
        Integer contador = 0;
        for (Object object : arrayInicial){
            arrayInicial[contador]= new Object[]{
                lista.get(contador).getNombre(),
                lista.get(contador).getSalario(),
                lista.get(contador).getDeducible(),
                lista.get(contador).getApellidos(),
            };
            contador++;
        }
        JTable tabla = new JTable(arrayInicial, new Object[]{"Nombre","Salario","Deducible","Apellidos"});
        JScrollPane panel = new JScrollPane(tabla);
        panel.setSize(600, 600);
        this.panelContenido.add(panel);
    }

    public void initializeJFrame3(ArrayList<Consulta3VO_79>lista){
        this.setTitle("Consulta 3");
        this.panelContenido = this.getContentPane();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(new FlowLayout());
        Object [][] arrayInicial = new Object[lista.size()][];
        Integer contador = 0;
        for (Object object : arrayInicial){
            arrayInicial[contador]= new Object[]{
                lista.get(contador).getID_Proyecto(),
                lista.get(contador).getNom_ape(),                
            };
            contador++;
        }
        JTable tabla = new JTable(arrayInicial, new Object[]{"ID_Proyecto","Nom_ape"});
        JScrollPane panel = new JScrollPane(tabla);
        panel.setSize(600, 600);
        this.panelContenido.add(panel);
    }
}
