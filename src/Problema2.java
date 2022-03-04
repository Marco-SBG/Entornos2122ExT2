public class Problema2 {
    public void cadena_de_numeros(int numero_inicial, int numero_final){
        for (int i = numero_inicial; i <= numero_final; i++) {
            if (i % 3 == 0 && i %5 == 0){
                System.out.print("FizzBuzz");
            }
            else if (i % 3 == 0){
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
