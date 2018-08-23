/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lpw
 */
@ManagedBean
@RequestScoped
public class navegacaoBean {

    /**
     * Creates a new instance of navegacaoBean
     */
    
    public navegacaoBean() {
    }
    
    public String navegar(){
        return "pagina3";
    }
    
    
}
