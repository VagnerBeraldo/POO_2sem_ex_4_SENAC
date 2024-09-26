/*
1) Escreva um programa usando o paradigma da orientação a objetos para criar um 
sistema que tenha duas Classes. As classes são aluno e professor, na qual cada 
classa tem dois métodos. A classe aluno tem os métodos avaliar e avaliar faltas. 
O primeiro método uma condição de aprovação, onde a média anual deve ser maior 
que 7. O usuário fornecerá as quatro notas bimestrais do período letivo.
O segundo método tem a condição de aprovação com presença superior à 75% de 
frequência as aulas. O usuário deverá informar o total de aulas no ano e total 
de faltas do aluno ao longo do período letivo.
A classe professor tem os métodos promoção e bonificação. O primeiro método tem 
a condição de promoção, na qual a quantidade de alunos aprovados seja superior a 
75%. O usuário deve fornecer o total de alunos na turma e total de alunos aprova
dos por este professor.
O segundo método tem a condição de bonificação igual a quantidade de aulas sema-
nais igual ou superior à 30 aulas semanais. O usuário deve fornecer a quantidade 
de aulas atribuidas ao professor.
*/
package orientacaoobjeto2ma4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de Rendimento Escolar e Profissional");
        
        System.out.println("Digite as 4 notas obtidas no ano: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();
        
        System.out.print("Digite o total de aulas no ano: ");
        double quantAulas = sc.nextInt();
        
        System.out.print("Digite o total de faltas no ano: ");
        double quantFaltas = sc.nextInt();

        
        System.out.print("Digite o total de alunos do professor: ");
        double totalAlunos = sc.nextInt();
        System.out.print("Digite o total de aprovados do professor: ");
        double totalAprovados = sc.nextInt();
        
        System.out.print("Digite a quantidade de aula ministrada: ");
        int totalAulaMinistrada = sc.nextInt();
        
        Aluno aluno = new Aluno();
        System.out.println("");
        System.out.println("Status do Aluno");
        aluno.avaliarMediaAnual(nota1, nota2, nota3, nota4);
        aluno.avaliarFaltas(quantAulas, quantFaltas);
        
        System.out.println("");
        System.out.println("Status do Professor");
        Professor professor = new Professor();
        professor.promocao(totalAlunos, totalAprovados);
        professor.bonificacao(totalAulaMinistrada);
    }
    
}
