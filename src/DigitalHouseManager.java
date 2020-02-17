import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    List<Aluno> listaAlunos = new ArrayList<>();
    List<Professor> listaProfessores = new ArrayList<>();
    List<Curso> listaCurso = new ArrayList<>();
    List<Matricula> listaMatricula = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){

        Curso curso1 = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);

        this.listaCurso.add(curso1);
    }

    public void excluirCurso(Integer codigoCurso){
        for (Curso curso : listaCurso) {
            if(curso.getCodigoCurso().equals(codigoCurso)){
                this.listaCurso.remove(curso);
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfessorAdjunto p1 = new ProfessorAdjunto(nome, sobrenome,0,codigoProfessor, quantidadeDeHoras);

        this.listaProfessores.add(p1);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTilular p1 = new ProfessorTilular(nome, sobrenome,0,codigoProfessor,especialidade):

        this.listaProfessores.add(p1);

    }

    public void excluirProfessor(Integer codigoProfessor){

        for(Professor professor : this.listaProfessores) {

            if(professor.getCodigoProfessor().equals(codigoProfessor)){
                this.listaProfessores.remove(professor);
            }
        }
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){

        Aluno aluno1 = localizarAluno(codigoAluno);
        Curso curso1 = localizarCurso(codigoCurso);

        if (!(curso1 == null) && !(aluno1 == null) && curso1.getListaAlunosMatriculados().size() < curso1.getQuantidadeMaximaAlunos()){

            curso1.adicionarUmAluno(aluno1);

            Matricula matricula1 = new Matricula(aluno1, curso1);

            this.listaMatricula.add(matricula1);

            System.out.println("Aluno matriculado");
        } else {
            System.out.println("Não há vagas no momento");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

        Curso curso1 = localizarCurso(codigoCurso);
        ProfessorTilular professorTilular = (ProfessorTilular) localizarPrfessor(codigoProfessorTitular);
        ProfessorAdjunto professorAdjunto = (ProfessorAdjunto) localizarPrfessor(codigoProfessorAdjunto);

        if (!(curso1 == null) && ! (professorTilular == null) && !(professorAdjunto == null)){
            curso1.setProfessorAdjunto(professorAdjunto);
            curso1.setProfessorTilular(professorTilular);
        }
    }

    


}
