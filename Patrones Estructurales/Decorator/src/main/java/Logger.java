import java.util.ArrayList;
import java.util.List;

public class Logger {

     private List<String> log = new ArrayList<String>();

     public void add(String message) {
          log.add(message);
     }

     public List<String> obtener() {
          return log;
     }
}