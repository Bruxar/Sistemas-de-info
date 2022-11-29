/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente.dao;

import java.sql.Connection;
import Entity.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
/**
 *
 * @author Moises
 */
public class ClienteDAO 
{
    private String mensaje = "";
    
    public String agregarCliente(Connection con, Cliente c){
        PreparedStatement pst = null;
        String sql = "INSERT INTO CLIENTE (RUT_CLIENTE, NOMBRE, APELLIDO_MAT, APELLIDO_PAT, CORREO)"
                    + "VALUES (?, ?, ?, ?, ?)";
        
        try 
        {
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getRut());
            pst.setString(2, c.getNombres());
            pst.setString(3, c.getApellido_mat());
            pst.setString(4, c.getApellido_pat());
            pst.setString(5, c.getCorreo());
            
            mensaje = "Guardado con éxito";
            
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e)
        {
            mensaje = "No se pudo guardar correctamente \n " + e.getMessage();
        }
        
        return mensaje;
    }
    
    public String modificarCliente(Connection con, Cliente c){
        PreparedStatement pst = null;
        String sql = "UPDATE CLIENTE SET = nombre = ?, apellido_mat = ?, apellido_pat = ?, correo = ?"
                   + "WHERE rut_cliente = ?";
        
        try 
        {
            pst = con.prepareStatement(sql);
            pst.setString(1, c.getNombres());
            pst.setString(2, c.getApellido_mat());
            pst.setString(3, c.getApellido_pat());
            pst.setString(4, c.getCorreo());
            pst.setInt(5, c.getRut());

            mensaje = "Actualizado correctamente.";
            
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e)
        {
            mensaje = "No se pudo guardar correctamente \n " + e.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarCliente(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM CLIENTE WHERE rut_cliente = ?";
        
        try 
        {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            mensaje = "Actualizado correctamente.";
            
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e)
        {
            mensaje = "No se pudo guardar correctamente \n " + e.getMessage();
        }
        
        return null;
    }
    
    public void listarCliente(Connection con, JTable tabla)
    {
        
    }
    
}

