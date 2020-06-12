public class Calculadora {
    
    private double valor1;
    private double valor2;
    int potencia;
    
    public double getValor1() {
        return this.valor1;
    }
    
    public void setValor1(double valor1){
        this.valor1 = valor1;
    }
    
       public double getValor2() {
        return this.valor2;
    }
    
    public void setValor2(double valor2){
        this.valor2 = valor2;
    }
    
    public double calcularSoma() {
        return this.valor1 + this.valor2;
    }
    
    public double calcularSubtracao() {
        return this.valor1 - this.valor2;
    }
    
    public double calcularMultiplicacao() {
        return this.valor1 * this.valor2;
    }
    
    public double calcularDivisao() {
        return this.valor1 / this.valor2;
    }
    
    public double calcularPotencia() {
        return Math.pow(valor1, this.potencia);
    }
    
    public double calcularRaiz() {
        return Math.sqrt(valor1);
    }
    
    public double calcularPotenciaParametroNumero2() {
        return Math.pow(valor1, this.valor2);
    }
    
    @Override
    public String toString() {
                      return   "\nValor 1: " + this.getValor1()
                          +"\nValor 2 :" +this.getValor2()
                          +"\nSoma: " +this.calcularSoma()
                          +"\nSubtração: " +this.calcularSubtracao()
                          +"\nMultiplicação: " +this.calcularMultiplicacao()
                          +"\nDivisão: " +this.calcularDivisao()
                          +"\nPotência: "+this.calcularPotencia()
                          +"\nRaiz: "+this.calcularRaiz()
                          +"\nPotência com valor 2: "+this.calcularPotenciaParametroNumero2();
    }
}

