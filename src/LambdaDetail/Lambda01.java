package LambdaDetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        //features.forEach(n -> System.out.println(n));

        List list = new ArrayList();
        list.add("Lambdas");
        list.add("Default Method");
        //list.forEach(n-> System.out.println(n));
        list.forEach(System.out::println);

    }
}
