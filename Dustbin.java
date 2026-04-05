class Dustbin{
	
	
    Dustbin(){
        this("Plastic");
        System.out.println("constructor");
    }
	
    Dustbin(String material){
        this(material,400);
        System.out.println("Dustbin plastic");
    }
	
    Dustbin(String material,int price){
        this(material,price,20);
        System.out.println("cost Dustbin");
    }
	
    Dustbin(String material,int price,int capacity){
        this(material,price,capacity,true);
        System.out.println("capacity of the Dustbin");
    }
	
    Dustbin(String material,int price,int capacity,boolean lid){
        System.out.println(material);
        System.out.println(price);
        System.out.println(capacity);
        System.out.println(lid);
        System.out.println("------_-----------------------");
    }
}