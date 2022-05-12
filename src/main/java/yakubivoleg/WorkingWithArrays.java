package yakubivoleg;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String [] colors = new String[5]; //no ability to change the size
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {1, 4, 7, 20}; //no ability to change the size
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (String color : colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);
        Arrays.stream(colors).collect(Collectors.toList());

        Integer[] intArray = {1, 2, 3, 4, 5};

        Arrays.stream(intArray).forEach(System.out::println);
    }
}
