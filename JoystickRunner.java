class JoystickRunner {
    public static void main(String[] args) {

        Joystick j1 = new Joystick();
        j1.brand="Logitech"; 
		j1.model="Extreme 3D"; 
		j1.price=3500;
		j1.color="Black";
		j1.isAvailable=true;
		j1.buttons=12;
		j1.rating=4.5;

        Joystick j2 = new Joystick();
        j2.brand="Sony"; 
		j2.model="DualShock";
		j2.price=4500;
		j2.color="White"; 
		j2.isAvailable=true; 
		j2.buttons=14; 
		j2.rating=4.6;

        Joystick j3 = new Joystick();
        j3.brand="Xbox";
		j3.model="Series X";
		j3.price=5000;
		j3.color="Black";
		j3.isAvailable=true; 
		j3.buttons=16; 
		j3.rating=4.7;

        Joystick j4 = new Joystick();
        j4.brand="Redgear";
		j4.model="Pro"; 
		j4.price=2000; 
		j4.color="Black";
		j4.isAvailable=false; 
		j4.buttons=12;
		j4.rating=4.2;

        Joystick j5 = new Joystick();
        j5.brand="CosmicByte"; 
		j5.model="Ares";
		j5.price=1800;
		j5.color="Blue"; 
		j5.isAvailable=true;
		j5.buttons=10; 
		j5.rating=4.1;

        System.out.println("*****");
        System.out.println(j1.brand); 
		System.out.println(j1.model); 
		System.out.println(j1.price);
		System.out.println(j1.color);
		System.out.println(j1.isAvailable); 
		System.out.println(j1.buttons); 
		System.out.println(j1.rating);

        System.out.println("*****");
        System.out.println(j2.brand);
		System.out.println(j2.model); 
		System.out.println(j2.price); 
		System.out.println(j2.color);
		System.out.println(j2.isAvailable);
		System.out.println(j2.buttons); 
		System.out.println(j2.rating);

        System.out.println("*****");
        System.out.println(j3.brand);
		System.out.println(j3.model); 
		System.out.println(j3.price); 
		System.out.println(j3.color);
		System.out.println(j3.isAvailable); 
		System.out.println(j3.buttons);
		System.out.println(j3.rating);

        System.out.println("*****");
        System.out.println(j4.brand); 
		System.out.println(j4.model);
		System.out.println(j4.price);
		System.out.println(j4.color);
		System.out.println(j4.isAvailable);
		System.out.println(j4.buttons); 
		System.out.println(j4.rating);

        System.out.println("*****");
        System.out.println(j5.brand);
		System.out.println(j5.model);
		System.out.println(j5.price);		
		System.out.println(j5.color); 
		System.out.println(j5.isAvailable); 
		System.out.println(j5.buttons); 
		System.out.println(j5.rating);
    }
}