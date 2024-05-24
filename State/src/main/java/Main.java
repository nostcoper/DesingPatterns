// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    User user = new User();

    System.out.println(user.getState().onActive());
    System.out.println(user.getState().onDisable());
    System.out.println(user.getState().onLock());
    System.out.println(user.getState().onBuy());

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}