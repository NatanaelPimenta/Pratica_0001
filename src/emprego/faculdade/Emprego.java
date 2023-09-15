package emprego.faculdade;

public class Emprego {
    public class EmpregadoDaFaculdade {
        private String nome;
        private double salario;
        private int horasAula;

        // Construtor
        public EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
            this.nome = nome;
            this.salario = salario;
            this.horasAula = horasAula;
        }

        // Alteração no método getGastos() para somar um bônus de R$ 40 por hora/aula
        double getGastos() {
            double gastos = this.salario + (this.horasAula * 40); // Adiciona o bônus por hora/aula
            return gastos;
        }

        // Alteração no método getInfo() para retornar o valor atualizado
        String getInfo() {
            return "Nome: " + this.nome + " com salário: R$" + this.salario + " com bônus: R$" + (this.horasAula * 40);
        }

        public static void main(String[] args) {
            // Criar um objeto EmpregadoDaFaculdade e exibir os resultados dos métodos
            EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade("João", 3000.0, 10);
            System.out.println("Gastos: R$" + empregado.getGastos());
            System.out.println(empregado.getInfo());
        }
    }

}
