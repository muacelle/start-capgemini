import java.util.Date;

public class Vendedor extends Funcionario {
    
    private int totalVendas;
    private float totalComissao;

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(float totalComissao) {
        this.totalComissao = totalComissao;
    }

    public Vendedor() {
        super();
    }

    public float calcularSalario() {
        return super.getSalario() + this.totalComissao;
    }

}
