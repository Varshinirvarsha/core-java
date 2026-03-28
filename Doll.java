class Doll {
    public static void main(String[] args) {

        String name;
        double price;
        int height;
        boolean isTalking;
        char rating;

        name = "Barbie";
        price = 499.99;
        height = 25;
        isTalking = true;
        rating = 'A';

        System.out.println("Initial Name: " + name);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Height: " + height);
        System.out.println("Initial Talking: " + isTalking);
        System.out.println("Initial Rating: " + rating);

        name = "Baby Doll";
        price = 350.50;
        height = 20;
        isTalking = false;
        rating = 'B';

        System.out.println("Updated Name: " + name);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Height: " + height);
        System.out.println("Updated Talking: " + isTalking);
        System.out.println("Updated Rating: " + rating);
    }
}