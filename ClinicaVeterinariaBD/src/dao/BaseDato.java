/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import operaciones.Dueno;
import vista.ListarDuenos;

/**
 *
 * @author vanes
 */
public class BaseDato {
    private Connection conn = ConexionBD.getConexion();
    
    //ingresar datos
    public Dueno ingresarNuevoDueno(Dueno objDueno) {
        boolean exito = false;
        String sql = "insert into tblDueno(nombre, apellido, edad, sexo, nombreMascota, sexoMascota) VALUES (?,?,?,?,?,?);";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,objDueno.getNombre());
            pst.setString(2,objDueno.getApellido());
            pst.setShort(3,objDueno.getEdad());
            pst.setString(4,Character.toString(objDueno.getSexo()));
            pst.setString(5,objDueno.getObjMascota().getNombreMascota());
            pst.setString(6,Character.toString(objDueno.getObjMascota().getSexoMascota()));
            
            pst.execute();
            objDueno.setEsExito(true);
            objDueno.setMensaje("El ingreso fue satisfactorio en dao");
        }catch (Exception error) {
            System.out.println("error caputado en ingresar");
            objDueno.setMensaje(error.toString());
        }
        return objDueno;
    }
    
    //listarDatos
    public ResultSet listarDueno(Dueno objDueno){
        ResultSet rs = null;
        
        try {
            String sql = "select * from tblDueno;";
            PreparedStatement pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        }
        catch (Exception error) {
            System.out.println("Excepcion capturada al listar: " + error);
        }
        return rs;
    }
    //buscarDueno
    public ResultSet buscarDueno(Dueno objDueno) {
        ResultSet rs = null;
        
        try {
            String sql = "select * from tblDueno where nombre like '%" + objDueno.getInputBuscar() + "%'" + "or apellido like '%" + objDueno.getInputBuscar() + "%';";
            PreparedStatement pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        }
        catch (Exception error) {
            System.out.println("Excepcion capturada al listar: " + error);
        }
        return rs;
    }
    //eliminarDueno
    public ResultSet eliminarDueno(Dueno objDueno) {
        ResultSet rs = null;
        
        try {
            String sql = "delete from tblDueno where id = "+objDueno.getBorrarDueno()+";";
            System.out.println(sql);
            PreparedStatement pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        }
        catch (Exception error) {
            System.out.println("Excepcion capturada al listar: " + error);
        }
        return rs;
    }
}
