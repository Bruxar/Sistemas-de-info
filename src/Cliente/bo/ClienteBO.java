/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente.bo;

import Entity.Cliente;
import java.sql.Connection;
import Cliente.dao.ClienteDAO;
import Conexion.Conexion;
/**
 *
 * @author Moises
 */
public class ClienteBO {
    
    private String mensaje = "";
    private ClienteDAO cdao = new ClienteDAO();
    
    public String agregarCliente(Cliente c){
        Connection conn = Conexion.getConnection();
        
        try 
        {
            mensaje = cdao.agregarCliente(conn, c);
            
        } catch (Exception e)
        {
            mensaje = mensaje + " " + e.getMessage();
        } finally{
            try{
                if ( conn != null ){
                    conn.close();
                }
                
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
}
    
    public String modificarCliente(Cliente c){
        Connection conn = Conexion.getConnection();
        
        try 
        {
            mensaje = cdao.modificarCliente(conn, c);
            conn.rollback();
            
        } catch (Exception e)
        {
            mensaje = mensaje + " " + e.getMessage();
        } finally{
            try{
                if ( conn != null ){
                    conn.close();
                }
                
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String eliminarCliente(int id){
        Connection conn = Conexion.getConnection();
        
        try 
        {
            mensaje = cdao.eliminarCliente(conn, id);
            conn.rollback();
            
        } catch (Exception e)
        {
            mensaje = mensaje + " " + e.getMessage();
        } finally{
            try{
                if ( conn != null ){
                    conn.close();
                }
                
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public void listarCliente(){
    }
    
}
