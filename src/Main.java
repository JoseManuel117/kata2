import java.io.File;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CarLoader loader = new CsvFileCarLoader(new File("CAR DETAILS FROM CAR DEKHO.csv"));
        List<Car> carList= loader.load();
        Map<String, Integer> result = new NameCarsProcessor().process(carList);

        for(String key : result.keySet()){
            System.out.println(key + " = " + result.get(key));
        }

    }
}