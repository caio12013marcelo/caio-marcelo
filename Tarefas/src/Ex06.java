import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        int[][] matriz = {
                {210, 3, 399900},
                {160, 3, 329900},
                {240, 3, 369000},
                {141, 2, 232000},
                {300, 4, 539900},
                {198, 4, 299900},
                {153, 3, 314900},
                {142, 3, 199000},
                {138, 3, 212000},
                {149, 3, 242500},
                {194, 4, 240000},
                {200, 3, 347000},
                {189, 3, 330000},
                {447, 5, 699900},
                {126, 3, 259900}
        };
        int somaValor=0;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                if(j == 2){
                    somaValor= somaValor+matriz[i][j];
                }
            }
        }
        System.out.println(somaValor);
    }
}
