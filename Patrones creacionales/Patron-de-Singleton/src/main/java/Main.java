public class Main {
  public static void main(String[] args) {

    Singleton SingletonA = Singleton.getInstance("Carlos");
    Singleton SingletonB = Singleton.getInstance("Hector");

    System.out.println(SingletonA.getName());
    System.out.println(SingletonB.getName());

    System.out.println(SingletonA == SingletonB);
  }
}