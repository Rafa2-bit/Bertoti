public class Empresa extends Cliente implements Emprestimo {

    String cnpj;

    public Empresa(String nome, String cnpj, int numConta ){
        super(nome, numConta);
        this.cnpj = cnpj;
    }

    @Override
    public boolean fazerEmprestimo() {
        return true;
    }
}
