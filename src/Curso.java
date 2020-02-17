import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private ProfessorTilular professorTilular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaAlunos;
    private List<Aluno> listaAlunosMatriculados = new ArrayList<>();

    public Curso(){

    }


    public Curso(String nome, Integer codigoCurso, Integer quantidadeMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public Boolean adicionarUmAluno(Aluno umAluno){

        if(listaAlunosMatriculados.size() < quantidadeMaximaAlunos ) {
            listaAlunosMatriculados.add(umAluno);
            return true;
        }
        return false;
    }

    public void excluirAluno(Aluno umAluno){
        listaAlunosMatriculados.remove(umAluno);
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

    public Integer getQuantidadeMaximaAlunos() {
        return quantidadeMaximaAlunos;
    }

    public void setQuantidadeMaximaAlunos(Integer quantidadeMaximaAlunos) {
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Curso{" +
                "codigoCurso=" + codigoCurso +
                '}';
    }
}
