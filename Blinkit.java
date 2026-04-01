class Blinkit {
    String grocery;
    int quantity;
    double price;

    public Blinkit(){}

    public Blinkit(String grocery,int quantity,double price){
        this.grocery=grocery;
        this.quantity=quantity;
        this.price=price;
    }

    public void display(){
        System.out.println(grocery);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}