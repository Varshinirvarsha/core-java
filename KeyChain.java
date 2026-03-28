class KeyChain {
    public static void main(String[] args) {

        String design;
        int length;
        double cost;
        boolean isMetal;
        char rating;

        design = "Heart";
        length = 5;
        cost = 45.99;
        isMetal = true;
        rating = 'A';

        System.out.println("Initial Design: " + design);
        System.out.println("Initial Length: " + length);
        System.out.println("Initial Cost: " + cost);
        System.out.println("Initial Metal: " + isMetal);
        System.out.println("Initial Rating: " + rating);

        design = "Star";
        length = 7;
        cost = 60.50;
        isMetal = false;
        rating = 'B';

        System.out.println("Updated Design: " + design);
        System.out.println("Updated Length: " + length);
        System.out.println("Updated Cost: " + cost);
        System.out.println("Updated Metal: " + isMetal);
        System.out.println("Updated Rating: " + rating);
    }
}