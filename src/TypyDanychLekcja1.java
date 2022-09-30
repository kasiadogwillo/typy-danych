public class TypyDanychLekcja1 {
    public static void main(String[] args) {

        //operatory matematyczne

        System.out.println(2 + 2);
        System.out.println(2 - 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);

        System.out.println(10 / 4); //otrzymamy wynik 2 - używamy liczb całkowitych, więc wyjdzie liczba całkowita - należy użyć 10.0
        System.out.println(10.0 / 4);

        //zmiennoprzecinkowe dla liczb całkowitych

        double a = 10;
        double b = 3;

        System.out.println(a / b);

        //operatory porównania - czy wartość jest mniejsza, większa, równa, różna od innej

        int numberOne = 2;
        int numberTwo = 4;

        //w odpowiedzi boolean true/false
        System.out.println(numberOne > numberTwo);
        System.out.println(numberOne < numberTwo);
        System.out.println(numberOne == numberTwo);
        System.out.println(numberOne != numberTwo);

        //operatory logiczne
        // || - lub

        //jeżeli którakolwiek ze stron zwraca true, całość zwraca true
        //jeżeli żadna ze stron nie zwraca true, całość zwraca false

        System.out.println(numberOne > numberTwo || numberOne == 1); //false || false = false
        System.out.println(numberOne < numberTwo || numberOne == 3); //true || false = true (pierwsza wartość to true, więc druga wartość nie jest już sprawdzana)
        System.out.println(numberOne > numberTwo || numberOne != 1); //false || true = true (pierwsza wartość jest sprawdzana, ale druga jest true)

        //&& - i - obie strony muszą być true/false

        System.out.println(numberOne < numberTwo && numberOne == 2); //true && true = true
        System.out.println(numberOne > numberTwo && numberTwo == 5); //false && false = false
        System.out.println(numberTwo == numberOne && numberTwo == 4); //false && true = false
    }
}