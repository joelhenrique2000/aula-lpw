package bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lpw
 */
@ManagedBean
@RequestScoped
public class componenteBean {

    
    
    public componenteBean() {
        this.opcoesSelecionadas.add("asd");
        this.opcoesSelecionadas.add("asd");
        this.opcoesSelecionadas.add("asd");
    }
    
    private ArrayList<String> opcoesSelecionadas = new ArrayList<>();
    
    private String opcao;

    public ArrayList<String> getOpcoesSelecionadas() {
        return opcoesSelecionadas;
    }

    public void setOpcoesSelecionadas(ArrayList<String> opcoesSelecionadas) {
        this.opcoesSelecionadas = opcoesSelecionadas;
    }

    
    
    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

   

    
}
