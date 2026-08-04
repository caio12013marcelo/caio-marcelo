import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso= input.nextDouble();
        System.out.println("Informe o sua altura: ");
        double alt= input.nextDouble();

        double imc= peso/(Math.pow(alt, 2));

        if (imc<18.5){
            System.out.println("IMC: Magreza");
        } else if (imc>18.5 && imc<24.9) {
            System.out.println("IMC: Saúdavel");
        } else if (imc>=25 && imc<29.9) {
            System.out.println("IMC: Sobrepeso");
        } else if (imc>=30 && imc<34.9 ) {
            System.out.println("IMC: Obesidade Grau |");
        } else if (imc>=35 && imc<39.9) {
            System.out.println("IMC: Obesidade Grau ||(severa)");
        } else{
            System.out.println("IMC: Obesidade Grau |||(morbida)");
        }
    }
}
