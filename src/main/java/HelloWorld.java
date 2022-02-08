import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Calculator calculator = new Calculator(1, 2);
        calculator.subtract();
        List<String> streamDebug = Arrays.asList("1", "2", "2");
      List<String> newStreamDebug = streamDebug.stream()
                .filter(p -> p.equals("2"))
                .collect(Collectors.toList());

    }

}
