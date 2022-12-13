import java.util.Date;

public class App {

    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setCpf("34055066990");
        v.setSalario(1000.0f);
        v.setDataNascimento(new Date());
        v.setTotalComissao(812.21f);

        System.out.println("Salário do vendedor: R$" + v.calcularSalario());
    }

}
