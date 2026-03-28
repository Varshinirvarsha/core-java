class PenStand {
    public static void main(String[] args) {

        String color;
        int penCount;
        double price;
        boolean isPlastic;
        char grade;

        color = "Blue";
        penCount = 10;
        price = 120.75;
        isPlastic = true;
        grade = 'A';

        System.out.println("Initial Color: " + color);
        System.out.println("Initial Pen Count: " + penCount);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Plastic: " + isPlastic);
        System.out.println("Initial Grade: " + grade);

        color = "Black";
        penCount = 6;
        price = 95.50;
        isPlastic = false;
        grade = 'B';

        System.out.println("Updated Color: " + color);
        System.out.println("Updated Pen Count: " + penCount);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Plastic: " + isPlastic);
        System.out.println("Updated Grade: " + grade);
    }
}