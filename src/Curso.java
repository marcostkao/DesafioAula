import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codigoCurso;
    private ProfessorTilular professorTilular;
    private ProfessorAdjunto professorAdjunto;
    List<Aluno> lista = new ArrayList<>();


    public Curso(String nome, Integer codigoCurso) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTilular getProfessorTilular() {
        return professorTilular;
    }

    public void setProfessorTilular(ProfessorTilular professorTilular) {
        this.professorTilular = professorTilular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public List<Aluno> getLista() {
        return lista;
    }

    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigoCurso.equals(curso.codigoCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCurso);
    }



}
