public class Principal {
    
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Zé";
        pessoa.peso = 60;
        pessoa.idade = 18;
        
        System.out.println("Seu nome é: " + pessoa.nome
                         + "\nSeu peso é: " + pessoa.peso
                         + "\nSeu idade é: " + pessoa.idade);
        
        System.out.println(pessoa.darBomDia());
        
        System.out.println("Idade em meses: " + pessoa.calcularIdadeEmMeses());
        
        System.out.println(pessoa.calcularIdadeEmMeses1());
        
        System.out.println(pessoa.calcularIdadeAoQuadrado());
        System.out.println(pessoa.adicionarDezPorCentoNoPeso());
        System.out.println(pessoa.calcularRaizQuadradaDaIdade());
       
    }
}
