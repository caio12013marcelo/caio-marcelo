import java.text.DecimalFormat;
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
        int tamanho300=0,soma300=0,cont300=0;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                if(j == 2){
                    somaValor= somaValor+matriz[i][j];
                }
                tamanho300=matriz[i][2];

                if(quanMaiorQuartos<matriz[i][1]){
                    maiorTamanho=matriz[i][0];
                    quanMaiorQuartos=matriz[i][1];

                }
                if(quantMenorQuartos>matriz[i][1]){
                    menorTamanho=matriz[i][0];
                    quantMenorQuartos=matriz[i][j];
                }
                if(matriz[i][1]<menorTamanho){
                    menorPreco=matriz[i][2];
                }
                if (tamanho300>=300.000){
                    soma300= soma300+matriz[i][0];
                    cont300++;
                }
            }
        }
        int media= somaValor/matriz.length;
        int dife= maiorTamanho-menorTamanho;
        tamanho300= soma300/cont300;
        System.out.println("Média dos preços: "+media);
        System.out.println("Preço da menor casa: "+ menorPreco);
        System.out.println(menorTamanho+ " || "+ maiorTamanho);
        System.out.println("Diferença de tamanho: "+dife);
        System.out.println("Média do tamanho das casas que custam mais de R$ 300.000: "+ tamanho300);
    }
}
