package exercicios.javaBasico.bigDecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var value1 = new BigDecimal("0.1");
        var value2 = new BigDecimal("0.2");
        System.out.println(value1.add(value2));
        System.out.println("===============================");

        /*
        contas com precisão
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.1")));
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.2")));
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.3")));
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.4")));
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.5")));
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.6")));
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.7")));
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.8")));
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.9")));
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.0")));
         */

    }
}
