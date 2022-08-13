/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Libro {
    private String codigo;
    private String nombrelibro;
    private String tipopasta;
    private String editorial;
    private String añopublicacion;
  
    
    public Libro(String codigo, String nombrelibro, String tipopasta, String editorial, String añopublicacion){
        this.codigo=codigo;
        this.nombrelibro=nombrelibro;
        this.tipopasta=tipopasta;
        this.editorial=editorial;    
        this.añopublicacion=añopublicacion;     
    }

    public Libro(String parameter, String parameter0, String parameter1, String parameter2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public void eliminarUsuario(Libro usu) throws Exception {
        String sql = "DELETE FROM LIBRO"
                + " WHERE IDUSUARIO = " + usu.getId_Libro();
        try {
            this.conectar(false);
            this.ejecutarOrden(sql);
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        }
     }
     
    public Libro(){
        this.nombrelibro="Libro de ejemplo";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombrelibro;
    }

    public void setNombre(String nombrelibro) {
        this.nombrelibro = nombrelibro;
    }

    public String getTipo() {
        return tipopasta;
    }

    public void setTipo(String tipopasta) {
        this.tipopasta = tipopasta;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
     public String getAño() {
        return añopublicacion;
    }

    public void setAño(String añopublicacion) {
        this.añopublicacion = añopublicacion;
    }
    

    private String getId_Libro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void conectar(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void ejecutarOrden(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void cerrar(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setId_Libro(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

