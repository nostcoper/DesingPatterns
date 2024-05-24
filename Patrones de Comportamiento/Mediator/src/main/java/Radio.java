public class Radio implements Component {

    private boolean encendida;

    private Mediator mediator;

    public void enciende() {
        encendida = true;
        mediator.enciendeRadio();
    }

    public void apaga() {
        encendida = false;
    }

    public boolean encendida() {
        return encendida;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return "Radio";
    }
}
