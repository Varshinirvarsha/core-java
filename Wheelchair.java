class Wheelchair {

    Wheelchair() {
        this("Steel");
        System.out.println("constructor");
    }

    Wheelchair(String material) {
        this(material, 4500);
        System.out.println(" two wheel chair");
    }

    Wheelchair(String material, int price) {
        this(material, price, true);
        System.out.println("usefull");
    }

    Wheelchair(String material, int price, boolean foldable) {
        this(material, price, foldable, 4);
        System.out.println("foldable wheel");
    }

    Wheelchair(String material, int price, boolean foldable, int wheels) {
        System.out.println(material);
        System.out.println(price);
        System.out.println(foldable);
        System.out.println(wheels);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}