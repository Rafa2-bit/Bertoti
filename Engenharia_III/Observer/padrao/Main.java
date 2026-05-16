public class Main {
    public static void main(String[] args) {
        // Criamos o sujeito (quem tem os dados)
        EstoqueSujeito estoque = new EstoqueSujeito("PlayStation 5", 10);

        // Criamos os observadores
        Observer painelWeb = new PainelWebObserver();
        Observer servicoEmail = new ServicoEmailObserver();

        // Registramos os observadores no sujeito
        estoque.registrarObserver(painelWeb);
        estoque.registrarObserver(servicoEmail);

        // Alterando o estoque -> Todos são notificados automaticamente!
        System.out.println("--- Primeira alteração de estoque ---");
        estoque.setQuantidade(8);

        System.out.println("\n--- Segunda alteração (Estoque Baixo) ---");
        estoque.setQuantidade(2);
        
        // Se quisermos remover o painel web, o sistema continua funcionando
        estoque.removerObserver(painelWeb);
    }
}