import java.util.Scanner;

public class PessoaMain {

    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        objetoPessoa.setPeso(leitor.nextFloat());

        System.out.print("Digite sua altura: ");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
        
    }
    
}
