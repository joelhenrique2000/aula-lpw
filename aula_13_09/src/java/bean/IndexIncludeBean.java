
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Joel
 */
@ManagedBean
@RequestScoped
public class IndexIncludeBean {

    private static String paginaAtual = "/WEB-INF/cadastrar.xhtml";
    
    public IndexIncludeBean() {
    }

    public String getPaginaAtual() {
        return paginaAtual;
    }

    public static void setPaginaAtual(String paginaAtual) {
       IndexIncludeBean.paginaAtual = paginaAtual;
    }
    
    public static void setVisualizar(){
        setPaginaAtual("/WEB-INF/visualizar.xhtml");
    }
    
    public static void setCadastrar(){
        setPaginaAtual("/WEB-INF/cadastrar.xhtml");
    }
    
    
}
