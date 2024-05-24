public class Coche implements Component {

    private Mediator mediator;

    public void enciende() {
        mediator.enciendeCarro();
    }

    public void apaga() {
        mediator.apagaCarro();
    }

    public String getName() {
        return "Coche";
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
