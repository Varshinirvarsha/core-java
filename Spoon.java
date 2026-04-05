class Spoon {

    Spoon() {
        this("Steel");
        System.out.println("Zero constructor");
    }

    Spoon(String material) {
        this(material, 50);
        System.out.println("One constructor");
    }

    Spoon(String material, int price) {
        this(material, price, true);
        System.out.println("Two constructor");
    }

    Spoon(String material, int price, boolean shiny) {
        this(material, price, shiny, 'M');
        System.out.println("Three constructor");
    }

    Spoon(String material, int price, boolean shiny, char size) {
        System.out.println(material);
        System.out.println(price);
        System.out.println(shiny);
        System.out.println(size);
        System.out.println("########################################");
    }
}