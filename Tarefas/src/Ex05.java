
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        double valorMaior=0;
        double valorMenor=0;
        double media=0,somaArray=0;
        for (int i=0;i< array.length;i++){
            System.out.println("Informe um número: ");
            array[i]= input.nextInt();

        }
        for (int i=0;i<array.length;i++){
            somaArray= somaArray+array[i];
            if(i==0){
                valorMaior=array[i];
                valorMenor=array[i];
            }
            if(array[i]>valorMaior){
                valorMaior=array[i];
            }else if (array[i]<valorMenor){
                valorMenor=array[i];
            }

        }
        media=somaArray/array.length;
        System.out.println("Maior array: "+valorMaior);
        System.out.println("Menor array: "+valorMenor);
        System.out.println("Media array: "+media);
    }
}
