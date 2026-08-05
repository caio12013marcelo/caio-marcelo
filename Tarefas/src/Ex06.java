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
        int menorPreco=matriz[0][0];
        int menorTamanho=matriz[0][0];
        int maiorTamanho=matriz[0][0];
        int quantMenorQuartos=matriz[0][0];
        int quanMaiorQuartos=matriz[0][0];
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                if(j == 2){
                    somaValor= somaValor+matriz[i][j];
                    if(matriz[i][j]<menorPreco){
                        menorPreco=matriz[i][j];
                    }
                }

                if(j==1){
                    if(quanMaiorQuartos<matriz.length){
                        maiorTamanho=matriz[i][0];
                        quanMaiorQuartos=matriz[i][j];

                    }
                    if(quantMenorQuartos>matriz.length){
                        menorTamanho=matriz[i][0];
                        quantMenorQuartos=matriz[i][j];
                    }
                }
            }
        }
        int media= somaValor/matriz.length;
        int dife= maiorTamanho-menorTamanho;
        System.out.println(media);
        System.out.println(dife);
    }
}
