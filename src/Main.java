public class Main {
    public static void main(String[] args) {
        int ticket = 5000; // стоимость одного билета
        int oneMiles = 20; // стоимость одной мили
        int miles = ticket / oneMiles; // начислено миль

        System.out.println(miles + " начислено миль");
    }
}