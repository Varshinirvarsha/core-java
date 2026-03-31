class BlackboardRunner {
    public static void main(String[] args) {

        Blackboard b1 = new Blackboard();
        b1.brand="Classmate";
		b1.model="Wall";
		b1.price=3000; 
		b1.color="Black"; 
		b1.isAvailable=true;
		b1.size=6; b1.rating=4.2;

        Blackboard b2 = new Blackboard();
        b2.brand="Cello";
		b2.model="Stand";
		b2.price=2500; 
		b2.color="Green"; 
		b2.isAvailable=true;
		b2.size=5; 
		b2.rating=4.0;

        Blackboard b3 = new Blackboard();
        b3.brand="Office";
		b3.model="Magnetic"; 
		b3.price=4000; 
		b3.color="Black";
		b3.isAvailable=true;
		b3.size=7; 
		b3.rating=4.4;

        Blackboard b4 = new Blackboard();
        b4.brand="School";
		b4.model="Wooden";
		b4.price=2000;
		b4.color="Black";
		b4.isAvailable=false;
		b4.size=4; 
		b4.rating=3.9;

        Blackboard b5 = new Blackboard();
        b5.brand="Premium"; 
		b5.model="Large";
		b5.price=5000; 
		b5.color="Green";
		b5.isAvailable=true; 
		b5.size=8;
		b5.rating=4.6;

        System.out.println("##########");
        System.out.println(b1.brand); 
		System.out.println(b1.model);
		System.out.println(b1.price);
		System.out.println(b1.color); 
		System.out.println(b1.isAvailable);
		System.out.println(b1.size); 
		System.out.println(b1.rating);

        System.out.println("##########");
        System.out.println(b2.brand); 
		System.out.println(b2.model); 
		System.out.println(b2.price); 
		System.out.println(b2.color); 
		System.out.println(b2.isAvailable); 
		System.out.println(b2.size); 
		System.out.println(b2.rating);

        System.out.println("############");
        System.out.println(b3.brand); 
		System.out.println(b3.model); 
		System.out.println(b3.price);
		System.out.println(b3.color);
		System.out.println(b3.isAvailable); 
		System.out.println(b3.size);
		System.out.println(b3.rating);

        System.out.println("###########");
        System.out.println(b4.brand); 
		System.out.println(b4.model);
		System.out.println(b4.price); 
		System.out.println(b4.color);
		System.out.println(b4.isAvailable); 
		System.out.println(b4.size); 
		System.out.println(b4.rating);

        System.out.println("#############");
        System.out.println(b5.brand); 
		System.out.println(b5.model); 
		System.out.println(b5.price);
		System.out.println(b5.color);
		System.out.println(b5.isAvailable); 
		System.out.println(b5.size); 
		System.out.println(b5.rating);
    }
}