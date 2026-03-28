class BucketHandle {
    public static void main(String[] args) {

        String material;
        double capacity;
        short weight;
        boolean isStrong;
        byte pieces;

        material = "Plastic";
        capacity = 15.5;
        weight = 2;
        isStrong = true;
        pieces = 1;

        System.out.println("Initial Material: " + material);
        System.out.println("Initial Capacity: " + capacity);
        System.out.println("Initial Weight: " + weight);
        System.out.println("Initial Strong: " + isStrong);
        System.out.println("Initial Pieces: " + pieces);

        material = "Steel";
        capacity = 20.0;
        weight = 3;
        isStrong = false;
        pieces = 2;

        System.out.println("Updated Material: " + material);
        System.out.println("Updated Capacity: " + capacity);
        System.out.println("Updated Weight: " + weight);
        System.out.println("Updated Strong: " + isStrong);
        System.out.println("Updated Pieces: " + pieces);
    }
}