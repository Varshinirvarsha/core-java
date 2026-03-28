class SchoolBag {
    public static void main(String[] args) {

        String color;
        byte pockets;
        float weight;
        boolean isWaterproof;
        char size;

        color = "Red";
        pockets = 4;
        weight = 0.85f;
        isWaterproof = true;
        size = 'L';

        System.out.println("Initial Color: " + color);
        System.out.println("Initial Pockets: " + pockets);
        System.out.println("Initial Weight: " + weight);
        System.out.println("Initial Waterproof: " + isWaterproof);
        System.out.println("Initial Size: " + size);

        color = "Blue";
        pockets = 3;
        weight = 0.65f;
        isWaterproof = false;
        size = 'M';

        System.out.println("Updated Color: " + color);
        System.out.println("Updated Pockets: " + pockets);
        System.out.println("Updated Weight: " + weight);
        System.out.println("Updated Waterproof: " + isWaterproof);
        System.out.println("Updated Size: " + size);
    }
}