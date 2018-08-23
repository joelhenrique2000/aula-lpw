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
 * @author 20161D12GR0542
 */
@ManagedBean
@RequestScoped
public class valor {

    private String a = "aba";

    public valor() {
        this.a = "bb";
    }
    
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    
    

    
}
