class TissueBox {
    public static void main(String[] args) {

        String company;
        int sheets;
        double price;
        char color;
        boolean isSoft;

        company = "Origami";
        sheets = 200;
        price = 75.25;
        color = 'W';
        isSoft = true;

        System.out.println("Initial Company: " + company);
        System.out.println("Initial Sheets: " + sheets);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Color: " + color);
        System.out.println("Initial Soft: " + isSoft);

        company = "Bella";
        sheets = 150;
        price = 65.50;
        color = 'P';
        isSoft = false;

        System.out.println("Updated Company: " + company);
        System.out.println("Updated Sheets: " + sheets);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Color: " + color);
        System.out.println("Updated Soft: " + isSoft);
    }
}