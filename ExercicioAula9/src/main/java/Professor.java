public class Professor extends Person {
    
    private int numeroDeRegistro;
    private double horasTrabalhadas;
    private double valorHora;
    
    public int getNumeroDeRegistro() {
        return this.numeroDeRegistro;
    }
    
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
     public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = numeroDeRegistro;
    }
    
    public double calcularSalarioBruto() {
        this.valorHora * this.horasTrabalhadas;
    }
    
}
