class DoorMat {
    public static void main(String[] args) {

        String material;
        short length;
        float width;
        boolean isWashable;
        char size;

        material = "Cotton";
        length = 60;
        width = 40.5f;
        isWashable = true;
        size = 'L';

        System.out.println("Initial Material: " + material);
        System.out.println("Initial Length: " + length);
        System.out.println("Initial Width: " + width);
        System.out.println("Initial Washable: " + isWashable);
        System.out.println("Initial Size: " + size);

        material = "Rubber";
        length = 50;
        width = 35.0f;
        isWashable = false;
        size = 'M';

        System.out.println("Updated Material: " + material);
        System.out.println("Updated Length: " + length);
        System.out.println("Updated Width: " + width);
        System.out.println("Updated Washable: " + isWashable);
        System.out.println("Updated Size: " + size);
    }
}