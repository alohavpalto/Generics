public class Main {

  public static void main(String[] args) {
    MagicBox<String> box1 = new MagicBox<>(3);
    box1.add("Карандаш");
    box1.add("Ручка");
    box1.add("Линейка");
    System.out.println("Cлучайный объект: " + box1.pick());

    MagicBox<Integer> box2 = new MagicBox<>(3);
    box2.add(1);
    box2.add(2);
    box2.add(3);
    System.out.println("Cлучайный объект: " + box2.pick());
  }
}
