public class User {

  private boolean enable;
  private boolean buying;
  private State state;

  public User() {
    this.state = new ActiveState(this);
  }

  public void changeState(State state) {
    this.state = state;
  }

  public void setBuying(boolean buyingState) {
    this.buying = buyingState;
  }

  public boolean isBuying() {
    return buying;
  }

  public boolean getEnable() {
    return enable;
  }

  public boolean setEnable(boolean enableState) {
    return this.enable = enableState;
  }

  public String startBuy() {
    return "Buying...";
  }

  public State getState() {
    return this.state;
  }
}