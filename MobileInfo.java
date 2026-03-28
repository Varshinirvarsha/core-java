class MobileInfo {

    static String brand = "Samsung";
    static byte cameras = 3;
    static float screenSize = 6.5f;

    public static void main(String[] args) {

        String color = "Black";
        int storage = 128;
        boolean fingerprint = true;

        System.out.println("Brand: " + brand);
        System.out.println("Cameras: " + cameras);
        System.out.println("Screen Size: " + screenSize);

        System.out.println("Color: " + color);
        System.out.println("Storage: " + storage);
        System.out.println("Fingerprint: " + fingerprint);
    }
}