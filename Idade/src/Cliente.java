public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) throws InvalidAgeException {
        if (idade <= 0 || idade < 18) {
            throw new InvalidAgeException("A idade deve ser maior que 18 anos.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}