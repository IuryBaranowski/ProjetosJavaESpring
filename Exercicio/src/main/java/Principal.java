import java.util.Scanner;
public class Principal {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        Produto produto = new Produto();
        
        produto.descricao = "Placa de video RTX 2010";
        produto.fornecedor = "Kabum";
        produto.quantidade = 5;
        produto.valorCusto = 2500;
        
        System.out.println("Escolha a porcentagem:");
        produto.porcentagem = scanner.nextInt();
        
        System.out.println("Produto: " + produto.descricao
                          +"\nFornecedor: " + produto.fornecedor
                          +"\nQuantidade: " + produto.quantidade
                          +"\nValor: " + produto.valorCusto
                          +"\nValor em estoque: " + produto.calcularValorEstoque()
                          +"\nValor com 65%: " + produto.adicionar65PorCento()
                          +"\nValor Porcentagem escolhida: " + produto.adicionarPorcentagem());
    }
    
}
