public class Main {
    public static void main(String[] args) {


        Car car1 = new Car();
        int price1 = car1.setPrice(300);
        System.out.println(price1);

        String type1= car1.setType("--<"+price1+">--");
        System.out.println(type1);

    }
}
