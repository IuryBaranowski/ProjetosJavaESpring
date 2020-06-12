package barros.iury.gradle;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(){

    }

    public Aluno(String nome, Double nota1, Double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) /2;
    }

    @Override
    public String toString() {
        return "\nNome do Aluno: " + this.nome
             + "\nNota 1: " + this.nota1
             + "\nNota 2: " + this.nota2
             + "\nMédia: " + this.calcularMedia();
    }
}
