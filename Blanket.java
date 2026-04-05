class Blanket{

    Blanket()
	{
        this("Wool");
        System.out.println("constructor");
    }
	
	
    Blanket(String material){
        this(material,1200);
        System.out.println("blanket type");
    }
	
    Blanket(String material,int price){
        this(material,price,"Blue");
        System.out.println("blanket colour");
    }
	
    Blanket(String material,int price,String color){
        this(material,price,color,2.5);
        System.out.println("blanket aviable");
    }
	
    Blanket(String material,int price,String color,double weight){
        System.out.println(material);
        System.out.println(price);
        System.out.println(color);
        System.out.println(weight);
        System.out.println("%%%%%%%%%%%%%%%%%%");
    }
}