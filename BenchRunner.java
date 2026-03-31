class BenchRunner {
    public static void main(String[] args) {

        Bench b1 = new Bench();
        b1.brand="Classmate"; b1.model="Wooden"; b1.price=3000; b1.color="Brown"; b1.isAvailable=true; b1.capacity=3; b1.rating=4.2;

        Bench b2 = new Bench();
        b2.brand="Nilkamal"; b2.model="Plastic"; b2.price=2000; b2.color="Blue"; b2.isAvailable=true; b2.capacity=2; b2.rating=4.0;

        Bench b3 = new Bench();
        b3.brand="Cello"; b3.model="School"; b3.price=2500; b3.color="Brown"; b3.isAvailable=true; b3.capacity=3; b3.rating=4.1;

        Bench b4 = new Bench();
        b4.brand="Durian"; b4.model="Office"; b4.price=5000; b4.color="Black"; b4.isAvailable=false; b4.capacity=4; b4.rating=4.5;

        Bench b5 = new Bench();
        b5.brand="Ikea"; b5.model="Metal"; b5.price=4500; b5.color="Grey"; b5.isAvailable=true; b5.capacity=3; b5.rating=4.3;

        System.out.println("*****");
        System.out.println(b1.brand); System.out.println(b1.model); System.out.println(b1.price); System.out.println(b1.color); System.out.println(b1.isAvailable); System.out.println(b1.capacity); System.out.println(b1.rating);

        System.out.println("*****");
        System.out.println(b2.brand); System.out.println(b2.model); System.out.println(b2.price); System.out.println(b2.color); System.out.println(b2.isAvailable); System.out.println(b2.capacity); System.out.println(b2.rating);

        System.out.println("*****");
        System.out.println(b3.brand); System.out.println(b3.model); System.out.println(b3.price); System.out.println(b3.color); System.out.println(b3.isAvailable); System.out.println(b3.capacity); System.out.println(b3.rating);

        System.out.println("*****");
        System.out.println(b4.brand); System.out.println(b4.model); System.out.println(b4.price); System.out.println(b4.color); System.out.println(b4.isAvailable); System.out.println(b4.capacity); System.out.println(b4.rating);

        System.out.println("*****");
        System.out.println(b5.brand); System.out.println(b5.model); System.out.println(b5.price); System.out.println(b5.color); System.out.println(b5.isAvailable); System.out.println(b5.capacity); System.out.println(b5.rating);
    }
}