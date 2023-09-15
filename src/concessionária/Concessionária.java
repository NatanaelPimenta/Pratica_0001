package concessionária;

public class Concessionária {
    // Classe Carro
    public class Carro {
        private String marca;
        private String modelo;
        private int anoFabricacao;
        private double preco;
        private boolean vendido;

        // Construtor
        public Carro(String marca, String modelo, int anoFabricacao, double preco) {
            this.marca = marca;
            this.modelo = modelo;
            this.anoFabricacao = anoFabricacao;
            this.preco = preco;
            this.vendido = false; // Inicialmente, o carro não foi vendido
        }

        // Getters e setters
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAnoFabricacao() {
            return anoFabricacao;
        }

        public void setAnoFabricacao(int anoFabricacao) {
            this.anoFabricacao = anoFabricacao;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public boolean isVendido() {
            return vendido;
        }

        public void setVendido(boolean vendido) {
            this.vendido = vendido;
        }
    }

    // Classe Cliente
    public class Cliente {
        private String nome;
        private String cpf;
        private String telefone;
        private String endereco;

        // Construtor
        public Cliente(String nome, String cpf, String telefone, String endereco) {
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.endereco = endereco;
        }

        // Getters e setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
    }

    // Classe Transação
    public class Transacao {
        private Carro carro;
        private Cliente cliente;
        private double valor;

        // Construtor
        public Transacao(Carro carro, Cliente cliente, double valor) {
            this.carro = carro;
            this.cliente = cliente;
            this.valor = valor;
        }

        // Getters e setters
        public Carro getCarro() {
            return carro;
        }

        public void setCarro(Carro carro) {
            this.carro = carro;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }

}
