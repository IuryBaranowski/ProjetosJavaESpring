public class PrincipalEsquadria {
    public static void main(String[] args) {
   
        System.out.println("\f");
        
        Porta porta = new Porta();
        porta.setDescricao("Porta sala");
        System.out.println(porta.getDescricao());
        
        Janela janela1 = new Janela();
        janela1.setDescricao("Janela");
        System.out.println(janela1.getDescricao());
        
        Janela janela2 = new Janela();
        janela2.setDescricao("Janela 2");
        System.out.println(janela2.getDescricao());
    }
}
