 class PowderCase {
    public static void main(String[] args) {

        String brand;
        short weight;
        double price;
        boolean isRefillable;
        char size;

        brand = "Lakme";
        weight = 120;
        price = 250.75;
        isRefillable = true;
        size = 'M';

        System.out.println("Initial Brand: " + brand);
        System.out.println("Initial Weight: " + weight);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Refillable: " + isRefillable);
        System.out.println("Initial Size: " + size);

        brand = "Ponds";
        weight = 95;
        price = 199.50;
        isRefillable = false;
        size = 'S';

        System.out.println("Updated Brand: " + brand);
        System.out.println("Updated Weight: " + weight);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Refillable: " + isRefillable);
        System.out.println("Updated Size: " + size);
    }
}