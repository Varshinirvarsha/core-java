class Plate {

    Plate() {
        this("Plastic");
        System.out.println("Zero plate");
    }

    Plate(String material) {

        System.out.println("One plate");
    }

    Plate(String material, int price) {
        this(material, price, "White");
        System.out.println("Two plate");
    }

    Plate(String material, int price, String color) {

        System.out.println("Three plate");
    } 

    Plate(String material, int price, String color, String shape) {
        System.out.println("Material : " + material);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
        System.out.println("Shape : " + shape);
        System.out.println("**********************");
    }
}