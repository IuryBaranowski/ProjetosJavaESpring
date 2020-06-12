import java.util.Scanner;
public class PrincipalCalculadora {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        Calculadora calculadora = new Calculadora();
       
        System.out.println("Escolha os numeros para as contas");
        System.out.println("Valor 1: ");
        calculadora.setValor1(scanner.nextDouble());
        System.out.println("Valor 2: ");
        calculadora.setValor2(scanner.nextDouble());
        System.out.println("Potência: ");
        calculadora.potencia = scanner.nextInt();
       
        System.out.println(calculadora);
    }
}
