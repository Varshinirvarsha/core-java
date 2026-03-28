class BookShelf {
    public static void main(String[] args) {

        String material;
        int bookCount;
        float height;
        boolean isWallMounted;
        char quality;

        material = "Wood";
        bookCount = 25;
        height = 120.5f;
        isWallMounted = false;
        quality = 'A';

        System.out.println("Initial Material: " + material);
        System.out.println("Initial Book Count: " + bookCount);
        System.out.println("Initial Height: " + height);
        System.out.println("Initial Wall Mounted: " + isWallMounted);
        System.out.println("Initial Quality: " + quality);

        material = "Steel";
        bookCount = 18;
        height = 100.0f;
        isWallMounted = true;
        quality = 'B';

        System.out.println("Updated Material: " + material);
        System.out.println("Updated Book Count: " + bookCount);
        System.out.println("Updated Height: " + height);
        System.out.println("Updated Wall Mounted: " + isWallMounted);
        System.out.println("Updated Quality: " + quality);
    }
}