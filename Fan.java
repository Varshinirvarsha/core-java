class Fan {
    public static void main(String[] args) {

        String brand;
        short speed;
        double price;
        boolean isRemoteControl;
        char rating;

        brand = "Usha";
        speed = 3;
        price = 2450.75;
        isRemoteControl = false;
        rating = 'A';

        System.out.println("Initial Brand: " + brand);
        System.out.println("Initial Speed: " + speed);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Remote: " + isRemoteControl);
        System.out.println("Initial Rating: " + rating);

        brand = "Havells";
        speed = 5;
        price = 3200.50;
        isRemoteControl = true;
        rating = 'B';

        System.out.println("Updated Brand: " + brand);
        System.out.println("Updated Speed: " + speed);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Remote: " + isRemoteControl);
        System.out.println("Updated Rating: " + rating);
    }
}