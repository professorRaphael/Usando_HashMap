package usandohashmap;
public class Turma {
    private long matricula;
    private String nome;
    private double nota;

    public Turma(long matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Turma\n" + "{matricula:" + matricula + "\nnome: " + nome + "\nnota: " + nota + '}';
    }
    
    
    
}
