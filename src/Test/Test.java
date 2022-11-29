
package Test;

import Cliente.bo.ClienteBO;
import Entity.Cliente;

/**
 *
 * @author Moises
 */
public class Test 
{ 
    ClienteBO cbo = new ClienteBO();
    Cliente c = new Cliente();
    String mensaje = "";
    
    public void insertar() {
        c.setRut(1);
        c.setNombres("Perro Nico");
        c.setApellido_mat("Parada");
        c.setApellido_pat("Leiva");
        c.setCorreo("mleiva@utem.cl");
        
        mensaje = cbo.agregarCliente(c);
        
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        test.insertar();
    }
}
