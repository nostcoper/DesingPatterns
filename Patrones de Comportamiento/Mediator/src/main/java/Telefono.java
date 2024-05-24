
public class Telefono implements Component {

    private boolean musicaOn;
    private Mediator mediator;

    public void recibeLlamada() {
        mediator.recibeLlamada();
    }

    public void enciendeMusica() {
        musicaOn = true;
    }

    public void apagaMusica() {
        musicaOn = false;
    }

    public boolean musicaEncendida() {
        return musicaOn;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return "Telefono";
    }
}
