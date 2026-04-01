class Amazon {
    String product;
    int price;
    float rating;

    public Amazon(){}

    public Amazon(String product,int price,float rating){
        this.product=product;
        this.price=price;
        this.rating=rating;
    }

    public void display(){
        System.out.println(product);
        System.out.println(price);
        System.out.println(rating);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}