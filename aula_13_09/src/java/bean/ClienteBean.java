
package bean;


import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Cliente;

/**
 *
 * @author Joel
 */
@ManagedBean
@RequestScoped
public class ClienteBean {

    private static LinkedList<Cliente> clientes = new LinkedList<>();
    private Cliente cliente;
    
    public ClienteBean() {
        this.cliente = new Cliente();
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addCliente() {
        ClienteBean.clientes.add(cliente);
        IndexIncludeBean.setVisualizar();
    }
    
}
