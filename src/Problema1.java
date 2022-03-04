public class Problema1 {

    static boolean multiploDe3(Integer n) {
        return n % 3 == 0;
    }

    static boolean multiploDe5(Integer n) {
        return n % 5 == 0;
    }

    static boolean multiploDe3Y5(Integer n) {
        return n % 5 == 0 && n % 3 == 0;
    }

    public static String listaNumeros() {
        String cadena = "1";
        for (int i = 2; i <= 20; i++) {
            cadena += i;
        }
        return cadena;
    }

     public static String listaNumerosYPalabras() {
        String cadena = "1";
        String numeroMultiploDe3;
        String NumeroMultiploDe5;
        String NumeroMultiploDe3y5;

        for (int i = 2; i <= 20; i++) {
            if (!multiploDe3(i) && !multiploDe5(i) && !multiploDe3Y5(i)) {
                cadena += i;
            }

            if (multiploDe3(i)) {
                numeroMultiploDe3 = "Fizz";
                cadena += numeroMultiploDe3;
            }

            if (multiploDe5(i)) {
                NumeroMultiploDe5 = "Buzz";
                cadena += NumeroMultiploDe5;
            }

            if (multiploDe3Y5(i)) {
                NumeroMultiploDe3y5 = "FizzBuzz";
                cadena += NumeroMultiploDe3y5;
            }
        }

        return cadena;
    }
}