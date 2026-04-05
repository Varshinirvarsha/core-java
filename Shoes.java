class Shoes {

    Shoes() {
        this("Nike");
        System.out.println("constructor");
    }

    Shoes(String brand) {
        this(brand, 2500);
        System.out.println("SHoesssss");
    }

    Shoes(String brand, int price) {
        this(brand, price, 8);
        System.out.println("Two  Shoes");
		
    }

    Shoes(String brand, int price, int size) {
        this(brand, price, size, "Black");
        System.out.println("Three RRRRRRRRRRRRR");
		
    }

    Shoes(String brand, int price, int size, String color) {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(size);
        System.out.println(color);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}