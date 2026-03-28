class LunchBag {
    public static void main(String[] args) {

        String brand;
        long price;
        float weight;
        boolean isMicrowaveSafe;
        char shape;

        brand = "Milton";
        price = 550L;
        weight = 0.75f;
        isMicrowaveSafe = true;
        shape = 'R';

        System.out.println("Initial Brand: " + brand);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Weight: " + weight);
        System.out.println("Initial Microwave Safe: " + isMicrowaveSafe);
        System.out.println("Initial Shape: " + shape);

        brand = "Cello";
        price = 650L;
        weight = 0.90f;
        isMicrowaveSafe = false;
        shape = 'S';

        System.out.println("Updated Brand: " + brand);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Weight: " + weight);
        System.out.println("Updated Microwave Safe: " + isMicrowaveSafe);
        System.out.println("Updated Shape: " + shape);
    }
}