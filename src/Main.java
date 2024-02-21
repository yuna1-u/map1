import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car, CarInfo> map = new HashMap<>();
        map.put(new Car(1, "RUS07581AA"), new CarInfo(1996,"Mercedes-Benz",10_000_000,"White"));
        map.put(new Car(2, "FKD76283BB"), new CarInfo(2023,"Porshe",25_000_000,"Red"));
        map.put(new Car(3, "KIL07581CC"), new CarInfo(2018,"BMW",17_000_000,"Black"));
        map.put(new Car(4, "NUR73036DD"), new CarInfo(2021,"Rolls-Royce", 40_000_000,"Grey"));

        for (Map.Entry<Car, CarInfo> i : map.entrySet()) {
            System.out.println(i);
        }
    }
}