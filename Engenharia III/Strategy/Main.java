
public class Main {
    public static void main(String[] args) {

        class Cliente {

            public boolean Emprestar(){
                return true;
            }
        }

        class ClienteComum{
            String nome, cpf;
            int idade;

            public ClienteComum(String nome, String cpf, int idade){
                this.cpf = cpf;
                this.nome = nome;
                this.idade = idade;
            }

        }

        class Estudante extends ClienteComum {
            public Estudante(String nome, String cpf, int idade){
                super(nome,cpf,idade);
            }

            //Isso aqui cheira mal (duplicação de código dificultando a manutenção de código)
            public boolean Emprestar(){
                return false;
            }

        }

    Estudante aluno = new Estudante("serebelo","222.333.444-55",33);
    aluno.Emprestar();
    System.out.println(aluno.Emprestar());
        
    }

}