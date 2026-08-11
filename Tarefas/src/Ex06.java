public class Ex06 {
    public static void main(String[] args) {
        // {tamanho, quartos, preço}
        double[][] casas = {
                {0, 4, 539900},   // tamanho não informado
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

        // a) Média dos preços
        double somaPrecos = 0;

        for (double[] casa : casas) {
            somaPrecos += casa[2];
        }

        double mediaPrecos = somaPrecos / casas.length;

        System.out.println("a) Média dos preços: R$ " + mediaPrecos);


        // b) Preço da menor casa
        double menorTamanho = Double.MAX_VALUE;
        double precoMenorCasa = 0;

        for (double[] casa : casas) {
            if (casa[0] > 0 && casa[0] < menorTamanho) {
                menorTamanho = casa[0];
                precoMenorCasa = casa[2];
            }
        }

        System.out.println("b) Preço da menor casa: R$ " + precoMenorCasa);


        // c) Diferença de tamanho entre a casa com mais quartos
        // e a menor casa entre as que possuem o menor número de quartos

        int maiorNumeroQuartos = 0;
        int menorNumeroQuartos = Integer.MAX_VALUE;

        for (double[] casa : casas) {
            if (casa[1] > maiorNumeroQuartos) {
                maiorNumeroQuartos = (int) casa[1];
            }

            if (casa[1] < menorNumeroQuartos) {
                menorNumeroQuartos = (int) casa[1];
            }
        }

        double tamanhoMaiorQuartos = 0;
        double menorTamanhoMenorQuartos = Double.MAX_VALUE;

        for (double[] casa : casas) {
            if ((int) casa[1] == maiorNumeroQuartos) {
                tamanhoMaiorQuartos = casa[0];
            }

            if ((int) casa[1] == menorNumeroQuartos && casa[0] > 0) {
                if (casa[0] < menorTamanhoMenorQuartos) {
                    menorTamanhoMenorQuartos = casa[0];
                }
            }
        }

        double diferenca = tamanhoMaiorQuartos - menorTamanhoMenorQuartos;

        System.out.println("c) Diferença de tamanho: " + diferenca + " m²");


        // d) Média do tamanho das casas que custam mais de R$ 300.000
        double somaTamanhos = 0;
        int quantidade = 0;

        for (double[] casa : casas) {
            if (casa[2] > 300000 && casa[0] > 0) {
                somaTamanhos += casa[0];
                quantidade++;
            }
        }

        double mediaTamanhos = somaTamanhos / quantidade;

        System.out.println("d) Média dos tamanhos acima de R$ 300.000: "
                + mediaTamanhos + " m²");
    }
}
