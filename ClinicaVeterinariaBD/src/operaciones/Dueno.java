/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import dao.BaseDato;
import java.sql.ResultSet;

/**
 *
 * @author vanes
 */
public class Dueno {
    private String _nombre;
    private String _apellido;
    private short _edad;
    private char _sexo;
    private Mascota objMascota = new Mascota();
    
    private boolean _esExito;
    private String _mensaje;
    private ResultSet _rs;
    
    private String _inputBuscar;
    private int _borrarDueno;
    
    public Dueno() {
    }

    public Dueno(String _nombre, String _apellido, short _edad, char _sexo, Mascota objMascota) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._edad = _edad;
        this._sexo = _sexo;
        this.objMascota = objMascota;
    }
    
    public Dueno ingresarNuevoDueno(Dueno objDueno) {
        BaseDato objBD = new BaseDato();
        objDueno = objBD.ingresarNuevoDueno(objDueno);
        return objDueno;
    }
    
    public ResultSet listarDueno(Dueno objDueno) {
        ResultSet rs = null;
        BaseDato objBD = new BaseDato();
        rs = objBD.listarDueno(objDueno);
        return rs;
    }
    
    public ResultSet buscarDueno(Dueno objDueno) {
        ResultSet rs = null;
        BaseDato objBD = new BaseDato();
        rs = objBD.buscarDueno(objDueno);
        return rs;
    }
    
    public ResultSet eliminarDueno(Dueno objDueno) {
        ResultSet rs = null;
        BaseDato objBD = new BaseDato();
        rs = objBD.eliminarDueno(objDueno);
        return rs;
    }

    public String getNombre() {
        return _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public short getEdad() {
        return _edad;
    }

    public char getSexo() {
        return _sexo;
    }

    public Mascota getObjMascota() {
        return objMascota;
    }

    public boolean isEsExito() {
        return _esExito;
    }

    public String getMensaje() {
        return _mensaje;
    }

    public ResultSet getRs() {
        return _rs;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public void setEdad(short _edad) {
        this._edad = _edad;
    }

    public void setSexo(char _sexo) {
        this._sexo = _sexo;
    }

    public void setObjMascota(Mascota objMascota) {
        this.objMascota = objMascota;
    }

    public void setEsExito(boolean _esExito) {
        this._esExito = _esExito;
    }

    public void setMensaje(String _mensaje) {
        this._mensaje = _mensaje;
    }

    public void setRs(ResultSet _rs) {
        this._rs = _rs;
    }

    public String getInputBuscar() {
        return _inputBuscar;
    }

    public void setInputBuscar(String _inputBuscar) {
        this._inputBuscar = _inputBuscar;
    }

    public int getBorrarDueno() {
        return _borrarDueno;
    }

    public void setBorrarDueno(int _borrarDueno) {
        this._borrarDueno = _borrarDueno;
    }
}
