class HairClip {
    public static void main(String[] args) {

        String color;
        byte quantity;
        float length;
        boolean isPlastic;
        char quality;

        color = "Black";
        quantity = 4;
        length = 6.5f;
        isPlastic = true;
        quality = 'A';

        System.out.println("Initial Color: " + color);
        System.out.println("Initial Quantity: " + quantity);
        System.out.println("Initial Length: " + length);
        System.out.println("Initial Plastic: " + isPlastic);
        System.out.println("Initial Quality: " + quality);

        color = "Gold";
        quantity = 2;
        length = 7.0f;
        isPlastic = false;
        quality = 'B';

        System.out.println("Updated Color: " + color);
        System.out.println("Updated Quantity: " + quantity);
        System.out.println("Updated Length: " + length);
        System.out.println("Updated Plastic: " + isPlastic);
        System.out.println("Updated Quality: " + quality);
    }
}