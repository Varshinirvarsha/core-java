class ChopsticksRunner {
    public static void main(String[] args) {

        Chopsticks c1 = new Chopsticks();
        c1.brand="Asian"; 
		c1.model="Wood"; c1.price=100; c1.color="Brown"; c1.isAvailable=true; c1.length=20; c1.rating=4.1;

        Chopsticks c2 = new Chopsticks();
        c2.brand="Tokyo"; c2.model="Steel"; c2.price=200; c2.color="Silver"; c2.isAvailable=true; c2.length=22; c2.rating=4.3;

        Chopsticks c3 = new Chopsticks();
        c3.brand="China"; c3.model="Bamboo"; c3.price=80; c3.color="Yellow"; c3.isAvailable=true; c3.length=21; c3.rating=4.0;

        Chopsticks c4 = new Chopsticks();
        c4.brand="Korea"; c4.model="Metal"; c4.price=150; c4.color="Silver"; c4.isAvailable=false; c4.length=23; c4.rating=4.2;

        Chopsticks c5 = new Chopsticks();
        c5.brand="Premium"; c5.model="Designer"; c5.price=300; c5.color="Black"; c5.isAvailable=true; c5.length=24; c5.rating=4.5;

        System.out.println("*****");
        System.out.println(c1.brand); System.out.println(c1.model); System.out.println(c1.price); System.out.println(c1.color); System.out.println(c1.isAvailable); System.out.println(c1.length); System.out.println(c1.rating);

        System.out.println("*****");
        System.out.println(c2.brand); System.out.println(c2.model); System.out.println(c2.price); System.out.println(c2.color); System.out.println(c2.isAvailable); System.out.println(c2.length); System.out.println(c2.rating);

        System.out.println("*****");
        System.out.println(c3.brand); System.out.println(c3.model); System.out.println(c3.price); System.out.println(c3.color); System.out.println(c3.isAvailable); System.out.println(c3.length); System.out.println(c3.rating);

        System.out.println("*****");
        System.out.println(c4.brand); System.out.println(c4.model); System.out.println(c4.price); System.out.println(c4.color); System.out.println(c4.isAvailable); System.out.println(c4.length); System.out.println(c4.rating);

        System.out.println("*****");
        System.out.println(c5.brand); System.out.println(c5.model); System.out.println(c5.price); System.out.println(c5.color); System.out.println(c5.isAvailable); System.out.println(c5.length); System.out.println(c5.rating);
    }
}