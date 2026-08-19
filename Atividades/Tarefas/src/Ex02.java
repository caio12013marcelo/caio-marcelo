import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome= input.next();
        System.out.println("Informe o seu sálario fixo: ");
        double sal= input.nextDouble();
        System.out.println("Informe o quanto vendeu: ");
        double vend= input.nextDouble();

        double comiss= vend*0.15;

        System.out.printf("Funcionário: "+nome+" o total a receber é "+(sal+comiss));
        input.close();
    }
}
