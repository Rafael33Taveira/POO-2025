public class cachorro {
    // Criação de variáveis e dados primitivos
    public int idade;
    public float peso;
    // Dados são classes
    public String nome, raça;
    // Método construtor
    public cachorro(){
        this.nome = "nome não definida";
        this.raça = "raça não definido";
    }
    public cachorro(int idade, float peso, String nome, String raça) {
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
        this.raça = raça;
    }

    // Método
    public void exibirDetalhes () {
        // this representa o objeto que chama o método
        System.out.println("Nome: " + this.nome +
                "\n Raça: " + this.raça +
                "\n Idade: " + this.idade +
                "\n Peso: " + this.peso);

    }
}
