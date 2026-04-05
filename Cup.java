class Cup {

    Cup() {
        this("Glass");
        System.out.println(" constructor");
    }

    Cup(String material) {
        this(material, 120);
        System.out.println(" constructor");
    }

    Cup(String material, int price) {
        this(material, price, "Blue");
        System.out.println("Two constructor");
    }

    Cup(String material, int price, String color) {
        this(material, price, color, true);
        System.out.println(" constructor");
    }

    Cup(String material, int price, String color, boolean handle) {
        System.out.println("Material : " + material);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
        System.out.println("Handle : " + handle);
        System.out.println("*********************************");
    }
}