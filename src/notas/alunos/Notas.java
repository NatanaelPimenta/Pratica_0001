package notas.alunos;

public class Notas {
    import java.util.Scanner;

    public class Aluno {
        private String nome;
        private int matricula;
        private double notaAV1;
        private double notaAV2;
        private double notaAE;
        private String curso;
        private String periodo;

        // Construtor
        public Aluno(String nome, int matricula, double notaAV1, double notaAV2, String curso, String periodo) {
            this.nome = nome;
            this.matricula = matricula;
            this.notaAV1 = notaAV1;
            this.notaAV2 = notaAV2;
            this.curso = curso;
            this.periodo = periodo;
        }

        // Métodos para alterar notas
        public void alteraNotaAV1(double novaNotaAV1) {
            this.notaAV1 = novaNotaAV1;
        }

        public void alteraNotaAV2(double novaNotaAV2) {
            this.notaAV2 = novaNotaAV2;
        }

        public void alteraNotaAE(double novaNotaAE) {
            this.notaAE = novaNotaAE;
        }

        // Método para avaliar o aluno
        public void avaliarAluno() {
            double notaTotal = notaAV1 + notaAV2;
            if (notaTotal >= 60) {
                System.out.println("Aluno " + nome + " Aprovado.");
            } else {
                System.out.println("Aluno " + nome + " Recuperação.");
            }
        }

        // Método para avaliar recuperação
        public void avaliarRecuperacao(double novaNotaAE) {
            double notaTotal = notaAV1 + notaAV2 + novaNotaAE;
            if (notaTotal >= 60) {
                System.out.println("Aluno " + nome + " Aprovado na Recuperação.");
            } else {
                System.out.println("Aluno " + nome + " Reprovado na Recuperação.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar dados do aluno pelo teclado
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a matrícula do aluno: ");
            int matricula = scanner.nextInt();
            System.out.print("Digite a nota da AV1: ");
            double notaAV1 = scanner.nextDouble();
            System.out.print("Digite a nota da AV2: ");
            double notaAV2 = scanner.nextDouble();
            System.out.print("Digite o curso do aluno: ");
            String curso = scanner.next();
            System.out.print("Digite o período do aluno: ");
            String periodo = scanner.next();

            // Criar um objeto Aluno com os dados inseridos
            Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

            // Avaliar o aluno
            aluno.avaliarAluno();

            // Verificar se é necessário a recuperação
            if (aluno.notaAV1 + aluno.notaAV2 < 60) {
                System.out.print("Digite a nota da AE (Avaliação de Recuperação): ");
                double notaAE = scanner.nextDouble();
                aluno.avaliarRecuperacao(notaAE);
            }

            scanner.close();
        }
    }

}
