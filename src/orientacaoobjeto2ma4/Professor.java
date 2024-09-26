package orientacaoobjeto2ma4;

public class Professor {

    public void promocao(double totalAlunos, double totalAprovados) {
        double avalPromocao = (totalAprovados / totalAlunos) * 100;

        if (avalPromocao >= 75) {
            System.out.printf("Professor promovido, porcentagem de aprovados %.2f%%\n", avalPromocao);
        } else {
            System.out.printf("Professor não promovido , porcentagem de aprovados %.2f%%\n", avalPromocao);
        }
    }

    public void bonificacao(int quantAula) {

        if (quantAula >= 30) {
            System.out.println("Bonificação liberada");
        } else {
            System.out.println("Sem bonificação");
        }
    }

}
