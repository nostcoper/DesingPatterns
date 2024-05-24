
public class GestorCarro implements Mediator {
  private Telefono telefono;
  private Radio radio;

  public void registerComponent(Component component) {
    component.setMediator(this);
     if (component.getName() == "Telefono") {
      telefono = (Telefono) component;
    } else if (component.getName() == "Radio") {
      radio = (Radio) component;
    }
  }

  public void enciendeCarro() {
    radio.enciende();
    telefono.apagaMusica();
  }

  public void apagaCarro() {
    radio.apaga();
  }

  public void enciendeRadio() {
    telefono.apagaMusica();
  }

  public void recibeLlamada() {
    radio.apaga();
  }
}