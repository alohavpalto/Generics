import java.util.Random;

public class MagicBox<T> {

  protected int countItem;
  protected T[] items;

  public MagicBox(int countItem) {
    this.items = (T[]) new Object[countItem];
  }

  public boolean add(T item) {
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        items[i] = item;
        return true;
      }
    }
    System.out.println("Места нет");
    return false;
  }

  public T pick() {
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        throw new RuntimeException(
            "коробка не полна осталось ещё  " + (items.length - i) + " ячеек заполнить");
      }
    }
    Random random = new Random();
    int randomInt = random.nextInt(items.length);
    return items[randomInt];
  }
}
