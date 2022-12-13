public class Pessoa {

    // Geralmente, todos os atributos da minha classe são privados.
    private float peso;
    private float altura;

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    // Métodos acessores (getters e setters)
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}
