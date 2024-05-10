public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.make = "Nissan";
        nissan.price = 50000;
        nissan.year = 2022;
        nissan.colour = "red";
        System.out.println("The car naem is " + nissan.make + ". It's cost is " + nissan.price + ". It was made in year " + nissan.year + ". And it's colour is " + nissan.colour);
        Car dogue = new Car();
        dogue.make = "Douge";
        dogue.price = 50000000;
        dogue.year = 2050;
        dogue.colour = "Great Firx";
        System.out.println("The car naem is " + dogue.make + ". It's cost is " + dogue.price + ". It was made in year " + dogue.year + ". And it's colour is " + dogue.colour);

    }
}
