package cyberlexcr;
import java.io.Serializable;
public class Termino implements Serializable, Comparable<Termino> {
    private static final long serialVersionUID = 1L;
    private String palabra;
    private String concepto;
    public Termino() {
    }
    public Termino(String palabra, String concepto) {
        this.palabra = palabra;
        this.concepto = concepto;
    }
    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    @Override
    public int compareTo(Termino otro) {
        return this.palabra.compareToIgnoreCase(otro.palabra);
    }
}
