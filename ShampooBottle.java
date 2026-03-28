class ShampooBottle {
    public static void main(String[] args) {

        String brand;
        float volume;
        int price;
        boolean isHerbal;
        char size;

        brand = "ClinicPlus";
        volume = 180.5f;
        price = 120;
        isHerbal = true;
        size = 'M';

        System.out.println("Initial Brand: " + brand);
        System.out.println("Initial Volume: " + volume);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Herbal: " + isHerbal);
        System.out.println("Initial Size: " + size);

        brand = "Sunsilk";
        volume = 340.0f;
        price = 210;
        isHerbal = false;
        size = 'L';

        System.out.println("Updated Brand: " + brand);
        System.out.println("Updated Volume: " + volume);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Herbal: " + isHerbal);
        System.out.println("Updated Size: " + size);
    }
}