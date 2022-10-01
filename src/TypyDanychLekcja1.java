public class TypyDanychLekcja1 {
    public static void main(String[] args) {

//        //4 zmienne int
//        int a = 9;
//        int b = 10;
//        int c = 12;
//        int d = 48;
//
//        //czy suma dwóch pierwszych liczb jest parzysta
//        //czy suma dwóch kolejnych liczb jest parzysta
//
//        int sum1 = (a + b);
//        int sum2 = (c + d);
//
//        //jeżeli obie sumy są parzyste - wyświetl informację, że wszystkie liczby są parzyste
//
//        if (sum1 % 2 == 0 && sum2 % 2 == 0)
//            System.out.println("obie te liczby są parzyste");
//
//        else
//            System.out.println("tylko jedna z tych liczb jest parzysta");


        //------
        //4 zmienne int
        int liczba1 = 123;
        int liczba2 = 212;
        int liczba3 = 22;
        int liczba4 = 68;

        //czy suma dwóch pierwszych liczb jest parzysta
        //czy suma dwóch kolejnych liczb jest parzysta


       int suma1 = liczba1 + liczba2;
        System.out.println(suma1);
       int suma2 = liczba3 + liczba4;
        System.out.println(suma2);

        //jeżeli obie sumy są parzyste - wyświetl informację, że wszystkie liczby są parzyste
        if(suma1 % 2 == 0 && suma2 % 2 == 0)
            System.out.println("wszystkie liczby są parzyste");
        else
            System.out.println("nie wszystkie liczby są parzyste");
    }
}