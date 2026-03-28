class CoffeMug {
    public static void main(String[] args) {

        String color;
        short capacity;
        float weight;
        boolean isCeramic;
        char size;

        color = "White";
        capacity = 250;
        weight = 0.35f;
        isCeramic = true;
        size = 'M';

        System.out.println("Initial Color: " + color);
        System.out.println("Initial Capacity: " + capacity);
        System.out.println("Initial Weight: " + weight);
        System.out.println("Initial Ceramic: " + isCeramic);
        System.out.println("Initial Size: " + size);

        color = "Black";
        capacity = 300;
        weight = 0.40f;
        isCeramic = false;
        size = 'L';

        System.out.println("Updated Color: " + color);
        System.out.println("Updated Capacity: " + capacity);
        System.out.println("Updated Weight: " + weight);
        System.out.println("Updated Ceramic: " + isCeramic);
        System.out.println("Updated Size: " + size);
    }
}