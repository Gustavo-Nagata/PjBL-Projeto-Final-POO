public class Main {
    public static void main(String[] args) {
        // Criar objetos de Cliente, AnalistaTI e AnalistaRH
        Cliente cliente1 = new Cliente("Lucas");
        AnalistaTI analistaTI = new AnalistaTI("Mariana", 101);
        AnalistaRH analistaRH = new AnalistaRH("Carlos", 102);

        // Criar e atualizar chamados
        cliente1.criarChamado("Erro ao acessar o sistema.");
        cliente1.atualizarChamado(1, "Erro ocorre apenas ao fazer login.");

        // Demonstrar polimorfismo
        Funcionario f1 = new AnalistaTI();
        Funcionario f2 = new AnalistaRH();

        f1.executarTarefa();  // Polimorfismo → executa tarefa do AnalistaTI
        f2.executarTarefa();  // Polimorfismo → executa tarefa do AnalistaRH
    }
}
