import java.util.Scanner;

public class App {

    // O método main é o ponto de partida de execução do código.
    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        objetoPessoa.peso = leitor.nextFloat();

        System.out.print("Digite sua altura: ");
        objetoPessoa.altura = leitor.nextFloat();

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
        
    }

}
