class Slipper {

    Slipper() {
        this("Rubber");
        System.out.println(" constructor");
    }

    Slipper(String material) {
        this(material, 300);
        System.out.println("Slipper ");
    }

    Slipper(String material, int price) {
        this(material, price, 7);
        System.out.println("Two");
    }

    Slipper(String material, int price, int size) {
        this(material, price, size, false);
        System.out.println("Slider structor");
    }

    Slipper(String material, int price, int size, boolean soft) {
        System.out.println(material);
        System.out.println(price);
        System.out.println(size);
        System.out.println(soft);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}