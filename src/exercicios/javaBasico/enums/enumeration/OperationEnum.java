package exercicios.javaBasico.enums.enumeration;

import java.util.function.BiFunction;

public enum OperationEnum {

    SUM(Integer::sum,"+"),
    SUBTRACT((Integer a, Integer b) -> a - b, "-"),
    MULTIPLY((Integer a, Integer b) -> a * b, "*"),
    DIVISION((Integer a, Integer b) -> a / b, "/");




    private final BiFunction<Integer, Integer, Integer> calculate;

    private final String symbol;


     OperationEnum(BiFunction<Integer, Integer, Integer> calculate, String symbol) {
        this.calculate = calculate;
         this.symbol = symbol;
     }

    public BiFunction<Integer, Integer, Integer> getCalculate() {
        return calculate;
    }


    public String getSymbol() {
        return symbol;
    }
}
