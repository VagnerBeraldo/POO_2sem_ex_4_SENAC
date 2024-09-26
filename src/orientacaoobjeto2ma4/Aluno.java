package orientacaoobjeto2ma4;

public class Aluno {

    public void avaliarMediaAnual(double n1, double n2, double n3, double n4) {
        double media = (n1 + n2 + n3 + n4) / 4;
        if (media >= 7) {
            System.out.printf("Aprovado com média escolar de %.2f\n", media);
        } else {
            System.out.printf("Reprovado com média escolar de %.2f\n", media);
        }
        
    }

    public void avaliarFaltas(double aula, double falta) {
        double porcFaltas = (falta / aula) * 100;

        if (porcFaltas > 25) {
            System.out.printf("Reprovado, por atingir %.2f%% de faltas\n", porcFaltas);
        } else {
            System.out.printf("Aprovado com %.2f%% de falta(s)\n", porcFaltas);
        }
        
    }

}
