import java.util.List;


public class LoggerDecorator implements BaseDatos {

  private final Logger logger; 
  private final BaseDatos bd;

  public LoggerDecorator(Logger logger, BaseDatos bd) {
    this.logger = logger;
    this.bd = bd;
  }

  public void inserta(String registro) {
    logger.add("inserta " + registro);
    bd.inserta(registro);
  }

  public List<String> registros() {
    logger.add("lectura");
    return bd.registros();
  }



}