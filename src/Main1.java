import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {

            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            double grade = Double.parseDouble(data[1]);
            if(students.containsKey(name)){

            }
        }



     }
}