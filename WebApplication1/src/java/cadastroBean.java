/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lpw
 */
@ManagedBean
@RequestScoped
public class cadastroBean {

    private String titulo;
    private String descricao;

    public cadastroBean(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    /**
     * Creates a new instance of cadastroBean
     */
    public cadastroBean() {
    }
    
}
