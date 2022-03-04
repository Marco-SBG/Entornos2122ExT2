
public class Problema3 {
    public void cadena_de_numeros(int numero_inicial, int numero_final) {
        for (int i = numero_inicial; i <= numero_final; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            }
            else if (i % 7 == 0 && i % 11 == 0) {
                System.out.print("FooBoo");
            }
            else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("FizzFoo");
            }
            else if (i % 3 == 0 && i % 11 == 0) {
                System.out.print("FizzBoo");
            }
            else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("BuzzFoo");
            }
            else if (i % 5 == 0 && i % 11 == 0) {
                System.out.print("BuzzBoo");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            else if (i % 7 == 0) {
                System.out.print("Foo");
            } else if (i % 11 == 0) {
                System.out.print("Boo");
            } else {
                System.out.print(i);
            }
        }
    }
}

