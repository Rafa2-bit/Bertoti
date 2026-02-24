package cenario2;

public class Main {
    public static void main(String[] args) {

        //Super classe
        class Cliente {

            String nome;
            int numConta;

            public Cliente(String nome, int numConta){
                this.numConta = numConta;
                this.nome = nome;
            }

            public boolean Emprestar(){
                return true;
            }
        }

        //Cliente comum não pode fazer emprestimo
        class ClienteComum extends Cliente{
            String cpf;
            int idade;

            public ClienteComum(String nome, String cpf, int idade, int numConta){
                super(nome, numConta);
                this.cpf = cpf;
                this.idade = idade;
            }

            //Isso aqui cheira mal (duplicação de código dificultando a manutenção futura)
            public boolean Emprestar(){
                return false;
            }

        }

        //Estudante não pode fazer eprestimo
        class Estudante extends Cliente {
            String cpf;
            int idade;

            public Estudante(String nome, String cpf, int idade, int numConta){
                super(nome, numConta);
            }

            //Isso aqui cheira mal (duplicação de código dificultando a manutenção futura)
            public boolean Emprestar(){
                return false;
            }

        }

       //EMpresa pode fazer emprestimo
        class Empresa extends Cliente {

            String cnpj;

            public Empresa(String nome, String cnpj, int numConta ){
                super(nome, numConta);
                this.cnpj = cnpj;
            }
        }

        //Aposentado pode fazer emprestimo
        class Aposentado extends Cliente{
            String cpf;
            int idade;

            public Aposentado(String nome, String cpf, int idade, int numConta){
                super(nome, numConta);
                this.cpf = cpf;
                this.idade = idade;
            }
        }
    
        ClienteComum fulano = new ClienteComum("Fulano", "223.232.333-32", 22, 65348764);
        System.out.println(fulano.Emprestar());

        Estudante aluno = new Estudante("Serebelo","222.333.444-55",33, 1234567);
        System.out.println(aluno.Emprestar());

        Empresa limitadaLtda = new Empresa("limitada.Ltda", "456.7812.123162.9712-00", 12345678);
        System.out.println(limitadaLtda.Emprestar());

        Aposentado vovô = new Aposentado("vovô", "123.456.789-00", 80, 12345678);
        System.out.println(vovô.Emprestar());
    
        
    }

}


