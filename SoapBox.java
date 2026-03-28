class SoapBox {
    public static void main(String[] args) {

        String soapName;
        int quantity;
        double price;
        boolean isAvailable;
        char qualityGrade;

        soapName = "Lux";
        quantity = 50;
        price = 35.75;
        isAvailable = true;
        qualityGrade = 'A';

        System.out.println("Initial Soap Name: " + soapName);
        System.out.println("Initial Quantity: " + quantity);
        System.out.println("Initial Price: " + price);
        System.out.println("Initial Availability: " + isAvailable);
        System.out.println("Initial Quality Grade: " + qualityGrade);

        soapName = "Dove";
        quantity = 30;
        price = 42.50;
        isAvailable = false;
        qualityGrade = 'B';

        System.out.println("Updated Soap Name: " + soapName);
        System.out.println("Updated Quantity: " + quantity);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated Availability: " + isAvailable);
        System.out.println("Updated Quality Grade: " + qualityGrade);
    }
}