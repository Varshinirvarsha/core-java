class ComputerRunner {
    public static void main(String[] args) {

        Computer c1 = new Computer();
        c1.brand="HP";
		c1.model="EliteDesk";
		c1.price=45000; 
		c1.color="Black";
		c1.isAvailable=true; 
		c1.ram=8; 
		c1.rating=4.3;

        Computer c2 = new Computer();
        c2.brand="Dell"; c2.model="Optiplex"; c2.price=40000; c2.color="Black"; c2.isAvailable=true; c2.ram=16; c2.rating=4.4;

        Computer c3 = new Computer();
        c3.brand="Lenovo"; c3.model="ThinkCentre"; c3.price=42000; c3.color="Grey"; c3.isAvailable=true; c3.ram=8; c3.rating=4.2;

        Computer c4 = new Computer();
        c4.brand="Asus"; c4.model="ExpertCenter"; c4.price=47000; c4.color="Black"; c4.isAvailable=false; c4.ram=16; c4.rating=4.5;

        Computer c5 = new Computer();
        c5.brand="Acer"; c5.model="Veriton"; c5.price=38000; c5.color="White"; c5.isAvailable=true; c5.ram=8; c5.rating=4.1;

        System.out.println("*****");
        System.out.println(c1.brand);
		System.out.println(c1.model);
		System.out.println(c1.price); 
		System.out.println(c1.color);
		System.out.println(c1.isAvailable);
		System.out.println(c1.ram);
		System.out.println(c1.rating);

        System.out.println("*****");
        System.out.println(c2.brand); System.out.println(c2.model); System.out.println(c2.price); System.out.println(c2.color); System.out.println(c2.isAvailable); System.out.println(c2.ram); System.out.println(c2.rating);

        System.out.println("*****");
        System.out.println(c3.brand); System.out.println(c3.model); System.out.println(c3.price); System.out.println(c3.color); System.out.println(c3.isAvailable); System.out.println(c3.ram); System.out.println(c3.rating);

        System.out.println("*****");
        System.out.println(c4.brand); System.out.println(c4.model); System.out.println(c4.price); System.out.println(c4.color); System.out.println(c4.isAvailable); System.out.println(c4.ram); System.out.println(c4.rating);

        System.out.println("*****");
        System.out.println(c5.brand); System.out.println(c5.model); System.out.println(c5.price); System.out.println(c5.color); System.out.println(c5.isAvailable); System.out.println(c5.ram); System.out.println(c5.rating);
    }
}