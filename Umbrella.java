class Umbrella{


    Umbrella(){
        this("Black");
        System.out.println("constructor");
    }
	
    Umbrella(String color){
        this(color,350);
        System.out.println("One Umbrella");
    }
	
    Umbrella(String color,int price){
        this(color,price,true);
        System.out.println("umberlla color");
    }
	
    Umbrella(String color,int price,boolean foldable){
        this(color,price,foldable,3);
        System.out.println("Umbrella   Info");
    }
	
    Umbrella(String color,int price,boolean foldable,int size){
        System.out.println(color);
        System.out.println(price);
        System.out.println(foldable);
        System.out.println(size);
        System.out.println("#################################");
    }
}