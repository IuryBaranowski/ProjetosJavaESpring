public class Produto {
        
        String descricao;
        String fornecedor;
        double valorCusto;
        int quantidade;
        int porcentagem;
        
    
    public double calcularValorEstoque() {
        return this.valorCusto * this.quantidade;
    }
    
    public double adicionar65PorCento() {
        return valorCusto * 1.65;
    }
    
    public double adicionarPorcentagem() {
        return this.valorCusto + (this.valorCusto * porcentagem/100);
    }

}
