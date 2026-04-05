class PaperBag {

    PaperBag() {
        this("Brown");
        System.out.println("Paper brand");
    }

    PaperBag(String color) {
        this(color, 20);
        System.out.println("Paper colour");
    }

    PaperBag(String color, int price) {
        this(color, price, true);
        System.out.println("the  paper");
		}
		

    PaperBag(String color, int price, boolean recycled) {
        this(color, price, recycled, 'M');
        System.out.println("the recycleed paper");
    }

    PaperBag(String color, int price, boolean recycled, char size) {
        System.out.println(color);
        System.out.println(price);
        System.out.println(recycled);
        System.out.println(size);
        System.out.println("*********************");
    }
}