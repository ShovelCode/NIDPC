import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculator {

    private final Map<String, BiFunction<Integer, Integer, Integer>> operators;

    public Calculator() {
        this.operators = new HashMap<>();
        operators.put("add", Integer::sum);
        operators.put("subtract", (a, b) -> a - b);
        operators.put("multiply", (a, b) -> a * b);
        operators.put("divide", (a, b) -> a / b);
    }

    public int calculate(String operator, int a, int b) {
        return operators.get(operator).apply(a, b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Add: " + calculator.calculate("add", 5, 3));
        System.out.println("Subtract: " + calculator.calculate("subtract", 5, 3));
        System.out.println("Multiply: " + calculator.calculate("multiply", 5, 3));
        System.out.println("Divide: " + calculator.calculate("divide", 5, 3));
    }
}
