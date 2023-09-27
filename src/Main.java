import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

         Map<Double, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            if(!map.containsKey(input[i])){
                map.put(input[i], 0);
            }
            map.put(input[i], map.get(input[i]) + 1);

         }

        for (Map.Entry<Double, Integer> kvp : map.entrySet()){
            System.out.printf("%.2f -> %d%n", kvp.getKey(), kvp.getValue());

        }
     }
}