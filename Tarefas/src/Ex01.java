import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Informe a sua matrícula: ");
        int mat=input.nextInt();
        System.out.println("Informe quantas horas trabalhadas na semana: ");
        double horas= input.nextDouble();
        System.out.println("Infore quanto ganha por hora: ");
        double pag= input.nextDouble();

        double total= (horas*pag)*4;
        System.out.printf("Funcionário: "+mat+" o total a receber é "+total);

        input.close();
    }
}
