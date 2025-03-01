import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos da classe Carro
        Carro obj1 = new Carro();
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu carro: "));
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade do carro: "));
        obj1.marca = JOptionPane.showInputDialog("Informe a marca do seu carro: ");
        obj1.modelo = JOptionPane.showInputDialog("Informe o modelo do seu carro: ");

        Carro obj2 = new Carro(2023, 0, "Fiat", "Argo");
        obj1.exibirDetalhes();
        obj1.acelerar(50);
        obj1.exibirDetalhes();
        obj2.exibirDetalhes();
        obj2.acelerar(60);
        obj2.exibirDetalhes();
        obj1.frear(10);
        obj1.exibirDetalhes();
        Carro obj3 = new Carro();
        obj3.exibirDetalhes();

    }
}