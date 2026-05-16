class ServicoEmailObserver implements Observer {
    @Override
    public void atualizar(String produto, int quantidade) {
        if (quantidade < 3) {
            System.out.println("[Observer] E-mail: Alerta de estoque crítico para " + produto + "!");
        }
    }
}