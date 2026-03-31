class KeyboardRunner {
    public static void main(String[] args) {

        Keyboard k1 = new Keyboard();
        k1.brand="Logitech"; k1.model="K120"; k1.price=800; k1.color="Black"; k1.isAvailable=true; k1.keys=104; k1.rating=4.3;

        Keyboard k2 = new Keyboard();
        k2.brand="HP"; k2.model="K500"; k2.price=900; k2.color="Black"; k2.isAvailable=true; k2.keys=104; k2.rating=4.1;

        Keyboard k3 = new Keyboard();
        k3.brand="Dell"; k3.model="KB216"; k3.price=750; k3.color="Black"; k3.isAvailable=true; k3.keys=104; k3.rating=4.0;

        Keyboard k4 = new Keyboard();
        k4.brand="Redragon"; k4.model="K552"; k4.price=2500; k4.color="RGB"; k4.isAvailable=false; k4.keys=87; k4.rating=4.6;

        Keyboard k5 = new Keyboard();
        k5.brand="Zebronics"; k5.model="ZEB-K20"; k5.price=600; k5.color="Black"; k5.isAvailable=true; k5.keys=104; k5.rating=3.9;

        System.out.println("*****");
        System.out.println(k1.brand); System.out.println(k1.model); System.out.println(k1.price); System.out.println(k1.color); System.out.println(k1.isAvailable); System.out.println(k1.keys); System.out.println(k1.rating);

        System.out.println("*****");
        System.out.println(k2.brand); System.out.println(k2.model); System.out.println(k2.price); System.out.println(k2.color); System.out.println(k2.isAvailable); System.out.println(k2.keys); System.out.println(k2.rating);

        System.out.println("*****");
        System.out.println(k3.brand); System.out.println(k3.model); System.out.println(k3.price); System.out.println(k3.color); System.out.println(k3.isAvailable); System.out.println(k3.keys); System.out.println(k3.rating);

        System.out.println("*****");
        System.out.println(k4.brand); System.out.println(k4.model); System.out.println(k4.price); System.out.println(k4.color); System.out.println(k4.isAvailable); System.out.println(k4.keys); System.out.println(k4.rating);

        System.out.println("*****");
        System.out.println(k5.brand); System.out.println(k5.model); System.out.println(k5.price); System.out.println(k5.color); System.out.println(k5.isAvailable); System.out.println(k5.keys); System.out.println(k5.rating);
    }
}