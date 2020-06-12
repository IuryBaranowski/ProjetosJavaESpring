public class Principal {
    public static void main(String[] args) {
   
        System.out.println("\f");
        
        A a = new A();
        
        B b = new B();
        
        a.setDescricao("abc");
        System.out.println("Descrição: "+a.getDescricao());
        
        b.setDescricao("qwe");
        System.out.println("Descrição: "+b.getDescricao());
    }
}
