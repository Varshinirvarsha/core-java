class BookMyShow {
    String movie;
    int seats;
    double price;

    public BookMyShow(){}

    public BookMyShow(String movie,int seats,double price){
        this.movie=movie;
        this.seats=seats;
        this.price=price;
    }

    public void display(){
        System.out.println(movie);
        System.out.println(seats);
        System.out.println(price);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}