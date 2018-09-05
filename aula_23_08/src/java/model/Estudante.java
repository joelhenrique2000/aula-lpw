
package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Estudante{
    private String nome;
    private String matricula;
    private String dataNascimento;
    private String cursoSelecionado;
    private ArrayList<String> turnosSelecionado;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCursoSelecionado() {
        return cursoSelecionado;
    }

    public void setCursoSelecionado(String cursoSelecionado) {
        this.cursoSelecionado = cursoSelecionado;
    }

    public ArrayList<String> getTurnosSelecionado() {
        return turnosSelecionado;
    }

    public void setTurnosSelecionado(ArrayList<String> turnosSelecionado) {
        this.turnosSelecionado = turnosSelecionado;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", matricula=" + matricula + '}'+"\n";
    }
    
    
}
