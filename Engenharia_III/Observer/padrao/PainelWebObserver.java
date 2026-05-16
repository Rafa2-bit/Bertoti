class PainelWebObserver implements Observer {
    @Override
    public void atualizar(String produto, int quantidade) {
        System.out.println("[Observer] Painel Web: " + produto + " atualizado para " + quantidade + " unidades.");
    }
}
