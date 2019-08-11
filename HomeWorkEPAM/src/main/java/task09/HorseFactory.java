package task09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class HorseFactory {

  static List<Horse> createHorse() {
    Random random = new Random();
    List<Horse> horse = new ArrayList<>();
    horse.add(new Horse(0, "Barsik", random.nextInt(25) + 70));
    horse.add(new Horse(1, "Myrzik", random.nextInt(25) + 70));
    horse.add(new Horse(2, "Tatoshka", random.nextInt(25) + 70));
    horse.add(new Horse(3, "Antoshka", random.nextInt(25) + 70));
    horse.add(new Horse(4, "Kyrlik", random.nextInt(25) + 70));
    horse.add(new Horse(5, "Kyrlik", random.nextInt(25) + 70));
    return horse;
  }
}
