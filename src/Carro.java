import javax.swing.*;

public class Carro {
    // Criação de variáveis e dados primitivos
    public int ano;
    public float velocidade;
    // Dados são classes
    public String marca, modelo;
    // Método construtor
    public Carro (){
        this.marca = "marca não definida";
        this.modelo = "modelo não definido";
    }
    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método
    public void exibirDetalhes () {
        // this representa o objeto que chama o método
        JOptionPane.showMessageDialog(null,"Marca: " + this.marca +
                "\n Modelo: " + this.modelo +
                "\n Ano: " + this.ano +
                "\n Velocidade: " + this.velocidade);

    }
    //acelerar o carro de x unidade
    public void acelerar (float x){
        this.velocidade = this.velocidade + x;
    }

    //frear o carro de y unidade
    public void frear (float y) {
        if (this.velocidade >= y) {
            this.velocidade -= y;
        } else {
           JOptionPane.showMessageDialog(null,"Velocidade não pode ser negativa");
        }
    }
}


