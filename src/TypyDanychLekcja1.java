public class TypyDanychLekcja1 {
    public static void main(String[] args) {

        //instrukcje sterujące
        //if-else

        if (true) {
            System.out.println("true testing"); //wartość wyświetla się w konsoli
        }
        if (false) {
            System.out.println("true testing false"); //wartość nie wyświetla się w konsoli
        }

        int numberOne = 2;
        int numberTwo = 4;

        if (numberOne < numberTwo)
            System.out.println("number One is less than number Two");
        if (numberOne > numberTwo)
            System.out.println("number One is more than number Two"); //fałsz - nie wyświetla się

        if (numberOne > numberTwo) {
            System.out.println("One is less than Two");
        } else { //boolean
            System.out.println("One is more than Two"); //warunek 1 jest fałszem, więc wyświetla się warunek drugi
        }

        //switch

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "defaultPage";

        switch(page){ //przełączanie się pomiędzy wartościami
            case "Home": //przełączamy się na stronę HOME
                System.out.println("Switching on Home page");
                break; //wychodzenie z przełącznika/instrukcji sterującej

            case "Login":
                System.out.println("Switching on Login page");
                break;

            case "Contact":
                System.out.println("Switching on Contact page");
                break;

            default: //wartość dowolna, gdy nie chcemy przyjmować żadnej z wymienionych
                System.out.println("Page not found");
                //bez break
        }
    }
}