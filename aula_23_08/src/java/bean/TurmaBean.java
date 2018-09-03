
package bean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Turma;


@ManagedBean
@RequestScoped
public class TurmaBean {

    private static ArrayList<Turma> turmas = new ArrayList<>();
    private Turma turma;
    
    public TurmaBean() {
         turma = new Turma();
    }
    
    
    
    public void cadastrarTurma() {
        turmas.add(turma);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
