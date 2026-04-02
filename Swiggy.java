class Swiggy {

    String hotelName;
    String item;
    double rating;
    int deliveryTime;

    public Swiggy() {
    }

    public Swiggy(String hotelName, String item, double rating, int deliveryTime) {
        this.hotelName = hotelName;
        this.item = item;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
        System.out.println("@@@@@@@checking@@@@@@");
    }

    public Swiggy(String hotelName, double rating) {
        this.hotelName = hotelName;
        this.rating = rating;
        System.out.println("@@@@rating@@@@@");
    }

    public Swiggy(String item) {
        this.item = item;
        System.out.println("@@@@@deliveryTime@@@@");
    }

    public void display() {
        System.out.println(hotelName);
        System.out.println(item);
        System.out.println(rating);
        System.out.println(deliveryTime);
    }
}