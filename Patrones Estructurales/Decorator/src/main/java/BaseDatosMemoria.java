import java.util.List;
import java.util.ArrayList;

public class BaseDatosMemoria implements BaseDatos {

    private final List<String> valores = new ArrayList<String>();

    public void inserta(String registro) {
        valores.add(registro);
    }

    public List<String> registros() {
        return new ArrayList<String>(valores);
    }
}