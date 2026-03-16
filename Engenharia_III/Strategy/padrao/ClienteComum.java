public class ClienteComum extends Cliente implements Emprestimo {
    String cpf;
    int idade;

    public ClienteComum(String nome, String cpf, int idade, int numConta){
        super(nome, numConta);
        this.cpf = cpf;
        this.idade = idade;
    }

    @Override
    public boolean fazerEmprestimo() {
        return false;
    }
}
