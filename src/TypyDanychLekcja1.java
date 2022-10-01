public class TypyDanychLekcja1 {
    public static void main(String[] args) {

        //nazwy klas pisane są wielką literą
        //Dane, TypyDanych itp.

        //nazwy zmiennych pisane są małą literą
        //rodzaje zmiennej - głównie String dużą literą
        String nazwaZmiennej = "to jest moja zmienna";
        int number = 10;
        char aToB = 'a';
        boolean isFalse = false;

        //formatowanie kodu
        //ctrl + alt + L - porządkuje kod

        //operator modulo - reszta z dzielenia - %

        System.out.println(10 % 5); //reszta z dzielenia 0 (2*5=10)
        System.out.println(10 % 6); //reszta z dzielenia 4

        //sprawdzenie, czy liczba jest parzysta

        if (10 % 2 == 0) {
            System.out.println("10 lest liczbą parzystą");
        }

        if (17 % 2 == 0) {
            System.out.println("17 jest liczbą parzystą");
        } else {
            System.out.println("17 nie jest liczbą parzystą");
        }
    }
}