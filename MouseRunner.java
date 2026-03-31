class MouseRunner {
    public static void main(String[] args) {

        Mouse m1 = new Mouse();
        m1.brand="Logitech"; m1.model="M170"; m1.price=700; m1.color="Black"; m1.isAvailable=true; m1.dpi=1000; m1.rating=4.2;

        Mouse m2 = new Mouse();
        m2.brand="HP"; m2.model="X100"; m2.price=600; m2.color="Black"; m2.isAvailable=true; m2.dpi=1200; m2.rating=4.0;

        Mouse m3 = new Mouse();
        m3.brand="Dell"; m3.model="MS116"; m3.price=650; m3.color="Black"; m3.isAvailable=true; m3.dpi=1000; m3.rating=4.1;

        Mouse m4 = new Mouse();
        m4.brand="Zebronics"; m4.model="ZEB-Rise"; m4.price=500; m4.color="Blue"; m4.isAvailable=false; m4.dpi=800; m4.rating=3.9;

        Mouse m5 = new Mouse();
        m5.brand="Redragon"; m5.model="M711"; m5.price=1500; m5.color="RGB"; m5.isAvailable=true; m5.dpi=7200; m5.rating=4.6;

        System.out.println("*****");
        System.out.println(m1.brand); System.out.println(m1.model); System.out.println(m1.price); System.out.println(m1.color); System.out.println(m1.isAvailable); System.out.println(m1.dpi); System.out.println(m1.rating);

        System.out.println("*****");
        System.out.println(m2.brand); System.out.println(m2.model); System.out.println(m2.price); System.out.println(m2.color); System.out.println(m2.isAvailable); System.out.println(m2.dpi); System.out.println(m2.rating);

        System.out.println("*****");
        System.out.println(m3.brand); System.out.println(m3.model); System.out.println(m3.price); System.out.println(m3.color); System.out.println(m3.isAvailable); System.out.println(m3.dpi); System.out.println(m3.rating);

        System.out.println("*****");
        System.out.println(m4.brand); System.out.println(m4.model); System.out.println(m4.price); System.out.println(m4.color); System.out.println(m4.isAvailable); System.out.println(m4.dpi); System.out.println(m4.rating);

        System.out.println("*****");
        System.out.println(m5.brand); System.out.println(m5.model); System.out.println(m5.price); System.out.println(m5.color); System.out.println(m5.isAvailable); System.out.println(m5.dpi); System.out.println(m5.rating);
    }
}