package HomeWork;

public class TasteTester {

    public static void main(String[] args) {

        WeddingCake weddingCake = new WeddingCake();
        BirthdayCake birthdayCake = new BirthdayCake();

        weddingCake.setLevels(3);
        weddingCake.setTaste("Chocolate");
        weddingCake.setPrice(900.00);
        System.out.println("You ordered wedding cake with taste of " + weddingCake.getTaste() +
                " and " + weddingCake.getLevels() + " levels. \nThe price is: " + weddingCake.getPrice());


        birthdayCake.setCandles(23);
        birthdayCake.setTaste("Strawberry");
        birthdayCake.setPrice(450.00);
        System.out.println("You ordered birthday cake with taste of " + birthdayCake.getTaste() +
                " and " + birthdayCake.getCandles() + " candles. \nThe price is: " + birthdayCake.getPrice());
    }

}
