/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Joel
 */
public class Turma {

    private String nome;
    private ArrayList<Estudante> estudantes;

    private void a() {
        String t = "";
        
        for(Estudante e : estudantes){
            t += e.getNome();
        }
    }
    
    public String toStringEstudantes() {
        
        String t = "";
        
        
        
        return "f";
    }
        
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
}
