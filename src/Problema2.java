public class Problema2 {
    public void cadena_de_numeros(){
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0){
                System.out.print("Fizz");
            }
            else if (i % 5 == 0){
                System.out.print("Buzz");
            }
            else {
                System.out.print(i);
            }
        }
    }
}