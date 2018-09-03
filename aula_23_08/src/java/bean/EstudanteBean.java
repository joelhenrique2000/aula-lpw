package bean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Estudante;

@ManagedBean(name = "estudanteBeanIndex")
@RequestScoped
public class EstudanteBean {

    private static ArrayList<Estudante> estudantes = new ArrayList<>();
    private Estudante estudante;

    public EstudanteBean() {
        estudante = new Estudante();
    }

    public void cadastrarEstudante() {
        estudantes.add(estudante);
    }
    
    public ArrayList<String> getListaTurnos() {
        ArrayList<String> turnos = new ArrayList<>();

        turnos.add("Manha");
        turnos.add("Tarde");
        turnos.add("Noite");

        return turnos;
    }

    public ArrayList<String> getListaCursos() {
        ArrayList<String> cursos = new ArrayList<>();

        cursos.add("TI");
        cursos.add("TEE");
        cursos.add("TMA");

        return cursos;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    
}
