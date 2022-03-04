import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema1 {

    @Test
    public void ProbarListaDeNumeros() {
        String listaNumeros = Problema1.listaNumeros();
        Assertions.assertEquals("1234567891011121314151617181920", listaNumeros);
    }

    @Test
    public void ProbarListaNumerosYPalabras() {
        String listaNumerosYPalabras = Problema1.listaNumerosYPalabras();
        Assertions.assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzFizzBuzz1617Fizz19Buzz", listaNumerosYPalabras);
    }
}
