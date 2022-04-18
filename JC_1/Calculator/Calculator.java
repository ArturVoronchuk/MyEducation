package JC_1.Calculator;

import java.util.function.*;
import java.util.function.Supplier;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // по дефолту не инициализированная переменная будет равна 0. Деление на 0 невозможно.
    BinaryOperator<Integer> divide = (x, y) -> y == 0 ? 0 : x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
