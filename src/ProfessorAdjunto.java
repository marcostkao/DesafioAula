public class ProfessorAdjunto extends Professor {
    private Integer quantidadeHoras;

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, Integer quantidadeHoras) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.quantidadeHoras = quantidadeHoras;
    }

    public Integer getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Integer quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }



}
