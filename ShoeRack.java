class ShoeRack {
    public static void main(String[] args) {

        String material;
        long price;
        int shelves;
        boolean isFoldable;
        char quality;

        material = "Wood";
        price = 2500L;
        shelves = 4;
        isFoldable = false;
        quality = 'A';

        System.out.println("Initial Material: " + material);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Shelves: " + shelves);
        System.out.println("Initial Foldable: " + isFoldable);
        System.out.println("Initial Quality: " + quality);

        material = "Steel";
        price = 1800L;
        shelves = 3;
        isFoldable = true;
        quality = 'B';

        System.out.println("Updated Material: " + material);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Shelves: " + shelves);
        System.out.println("Updated Foldable: " + isFoldable);
        System.out.println("Updated Quality: " + quality);
    }
}