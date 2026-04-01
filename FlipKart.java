class Flipkart {
    String item;
    int price;
    boolean available;

    public Flipkart(){}

    public Flipkart(String item,int price,boolean available){
        this.item=item;
        this.price=price;
        this.available=available;
    }

    public void display(){
        System.out.println(item);
        System.out.println(price);
        System.out.println(available);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}