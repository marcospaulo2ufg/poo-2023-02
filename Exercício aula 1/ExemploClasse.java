public class ExemploClasse {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 25);

        System.out.println("Idade: " + pessoa1.idade);

        System.out.println("Nome: " + pessoa1.getNome());

        pessoa1.setNome("Bob");

        pessoa1.saudacao();
    }
}
