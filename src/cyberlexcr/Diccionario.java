package cyberlexcr;
import java.io.Serializable;
import java.util.ArrayList;
public class Diccionario implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Termino> terminos;
    public Diccionario() {
        this.terminos = new ArrayList<>();
    }
    public Diccionario(ArrayList<Termino> terminos) {
        this.terminos = terminos;
    }
    public ArrayList<Termino> getTerminos() {
        return terminos;
    }
    public void setTerminos(ArrayList<Termino> terminos) {
        this.terminos = terminos;
    }
}
