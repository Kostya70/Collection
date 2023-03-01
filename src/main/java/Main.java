import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -o1.compareTo(o2);
//            }
//        });
//        for (int i = 0; i < 100; i++) {
//            numbers.add((int)(Math.random() * 10));
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//    }
        HashMap<CarOwner, Car> map = new HashMap<>();
        CarOwner key = new CarOwner(1, "Name", "LastName");
        map.put(key, new Car("Brand1", 1));
        key.setId(8);
        for (CarOwner carOwner : map.keySet()) {
            System.out.println(carOwner.getId());
        }
        Car car = map.get(key);
        System.out.println(car.getBrand());
    }
}
