public class Cliente {
    private final String nome;
    private final int cpf;

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getCpf() {return cpf;}
    public String getNome() {return nome;}
}
