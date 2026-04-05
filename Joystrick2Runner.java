class Joystick2{
    Joystick2(){
        this("Sony");
        System.out.println("Zero constructor");
    }
    Joystick2(String brand){
        this(brand,2500);
        System.out.println("One constructor");
    }
    Joystick2(String brand,int price){
        this(brand,price,true);
        System.out.println("Two constructor");
    }
    Joystick2(String brand,int price,boolean vibration){
        this(brand,price,vibration,4);
        System.out.println("Three constructor");
    }
    Joystick2(String brand,int price,boolean vibration,int buttons){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(vibration);
        System.out.println(buttons);
        System.out.println("------");
    }
}