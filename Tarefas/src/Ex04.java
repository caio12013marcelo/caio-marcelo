import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int user=1;
        double altMaior=0,somaAtleta=0,altMenor=10;
        int userMaior=0,userMenor=0;
        int contador=0;

        while (user!=0){

            System.out.println("Informe a inscrição do atleta: ");
            user= input.nextInt();
            if (user!=0) {
                contador++;
                System.out.println("Informe a altura dele: ");
                double alt = input.nextDouble();
                somaAtleta= somaAtleta+alt;
                if (alt > altMaior) {
                    altMaior = alt;
                    userMaior = user;
                } else if (alt < altMenor) {
                    altMenor = alt;
                    userMenor = user;
                }
               
            }
        }
        double mediaAltura= somaAtleta/contador;
        System.out.println("Atleta mais Alto "+userMaior+" e sua altura é "+altMaior);
        System.out.println("Atleta mais Baixo "+userMenor+" e sua altura é "+altMenor);
        System.out.println("Média das alturas dos atletas é "+mediaAltura);




        input.close();
    }
}
