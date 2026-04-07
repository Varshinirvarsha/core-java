class EastSureRunner {

    public static void main(String[] args) {

        int price = 0;
        
        price = EastSure.checkItem("VegBiryani");
        System.out.println("Price of VegBiryani : " + price);
        totalPrice = EastSure.checkItem("VegBiryani", price, 2);
        System.out.println("Total price : " + totalPrice);

        price = EastSure.checkItem("ChickenBiryani");
        System.out.println("Price of ChickenBiryani : " + price);
        totalPrice = EastSure.checkItem("ChickenBiryani", price, 1);
        System.out.println("Total price : " + totalPrice);

        price = EastSure.checkItem("PaneerBiryani");
        System.out.println("Price of PaneerBiryani : " + price);
        totalPrice = EastSure.checkItem("PaneerBiryani", price, 3);
        System.out.println("Total price : " + totalPrice);

        
    }
}