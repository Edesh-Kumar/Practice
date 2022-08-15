package OOPS.encapsulation;

public class CarDriver {
    public static void main(String[] args) {
        PublicCar c1 = new PublicCar();
        c1.price = 187113;
        c1.modelNumber = "2022";
        System.out.println(c1.modelNumber);
        System.out.println(c1.price);
    }
}
