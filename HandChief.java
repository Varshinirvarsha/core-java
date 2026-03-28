class Handchief {
    public static void main(String[] args) {

        String color;
        int price;
        float length;
        boolean isCotton;
        char size;

        color = "White";
        price = 25;
        length = 30.5f;
        isCotton = true;
        size = 'M';

        System.out.println("Initial Color: " + color);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Length: " + length);
        System.out.println("Initial Cotton: " + isCotton);
        System.out.println("Initial Size: " + size);

        color = "Blue";
        price = 35;
        length = 28.0f;
        isCotton = false;
        size = 'S';

        System.out.println("Updated Color: " + color);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Length: " + length);
        System.out.println("Updated Cotton: " + isCotton);
        System.out.println("Updated Size: " + size);
    }
}