public class CadastroCliente {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("João", 17); 
            System.out.printf("Cliente: %s | Idade: %d%n", cliente.getNome(), cliente.getIdade());
        } 
        
        catch (InvalidAgeException e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }
}