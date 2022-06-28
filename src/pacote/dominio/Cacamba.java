package pacote.dominio;

/**
 *
 * @author Gustavo Almeida
 */
public class Cacamba {
    private String tamanho;
    private String nserie;
    private float valor;
    private boolean locada;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isLocada() {
        return locada;
    }

    public void setLocada(boolean locada) {
        this.locada = locada;
    }
    
}
