public class Pessoa {
    
    String nome;
    double peso;
    int idade;
    
    public String falar1(String mensagem) {
        return mensagem;
    };   
    
    public void falar2(String mensagem) {
        System.out.println(mensagem);
    }
    
    public String darBomDia() {
        return "Bom dia";
    }
    
    public int calcularIdadeEmMeses() {
        return this.idade * 12;
    }
    
    public String calcularIdadeEmMeses1() {
        return "Idade em meses: " + (this.idade * 12);
    }
    
    public double calcularIdadeAoQuadrado() {
        return Math.pow(this.idade, 2);
    }
    
    public double calcularRaizQuadradaDaIdade() {
        return Math.sqrt(this.idade);
    }
    
    public double adicionarDezPorCentoNoPeso() {
        return this.peso * 1.1;
    }
}
