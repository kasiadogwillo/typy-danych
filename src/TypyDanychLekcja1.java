public class TypyDanychLekcja1 {
    public static void main(String[] args) {

        //zmienne

        //int - typ zmiennej dla liczb całkowitych
        int number10; //typ zmiennej (INT) nazwa zmiennej (NUMBER10) = deklaracja zmiennej
        number10 = 10; //nazwa zmiennej (NUMBER10) = wartość zmiennej = inicjalizacja zmiennej (przypisanie wartości do zmiennej)

        System.out.println(number10);

        //skrót:
        long number = 1000000000000000000L;

        System.out.println(number);

        //również
        //byte b;
        //short s;
        //int i;
        //long l; - na końcu dodajemy L, IntelliJ zaznaczy za dużą wartość
        //w zależności od wartości

        //double - typ zmiennej dla liczb zmiennoprzecinkowych
        double doubleNumber = 10.567;

        //również float f;

        System.out.println(doubleNumber);

        //string - typ zmiennej dla tekstu - typ referencyjny/złożony
        String myText = "my text in java";

        System.out.println(myText);

        //char - character - typ zmiennej dla pojedynczego znaku
        char oneCharacter = 'a';

        System.out.println(oneCharacter);

        //boolean - typ zmiennej prawda/fałsz
        boolean trueValue = true;
        boolean falseValue = false;

        System.out.println(trueValue);
        System.out.println(falseValue);


    }
}
