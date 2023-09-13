package tests.testtwo;

import java.time.Duration;
import java.time.LocalTime;

public class CompararTempo {
    public static void main(String[] args) {
        LocalTime hora1 = LocalTime.of(10, 0);
        LocalTime hora2 = LocalTime.of(11, 0);

        System.out.println(hora1.compareTo(hora2));
        hora2 = LocalTime.of(11, 30);

        System.out.println(hora2.compareTo(hora1));
        hora1 = LocalTime.of(7, 0);
        System.out.println(hora2.compareTo(hora1));

        // Com isso conclui-se que a biblioteca retorna 1 se for depois, e -1 se for antes.

        System.out.println(Duration.between(hora2, hora1));
        System.out.println(Duration.between(hora1, hora2));
        System.out.println(Duration.between(hora2, hora1).abs());

        System.out.println(Duration.between(hora1, hora2).abs().dividedBy(4));
        // Com isso, vemos que a biblioteca Duration dá conta do recado.
    }
}
