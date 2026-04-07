class MaggiPinRunner {

    public static void main(String[] args) {

        int price = 0;
        
        price = MaggiPin.checkItem("MasalaMaggi");
        System.out.println("Price of MasalaMaggi : " + price);
        totalPrice = MaggiPin.checkItem("MasalaMaggi", price, 2);
        System.out.println("Total price : " + totalPrice);

        price = MaggiPin.checkItem("CheeseMaggi");
        System.out.println("Price of CheeseMaggi : " + price);
        totalPrice = MaggiPin.checkItem("CheeseMaggi", price, 1);
        System.out.println("Total price : " + totalPrice);

		
		price = MaggiPin.checkItem("DoubleMasalaMaggi");
        System.out.println("Price of DoubleMasalaMaggi : " + price);
        totalPrice = MaggiPin.checkItem("DoubleMasalaMaggi", price, 2);
        System.out.println("Total price : " + totalPrice);

        price = MaggiPin.checkItem("JumboMaggi");
        System.out.println("Price of JumboMaggi : " + price);
        totalPrice = MaggiPin.checkItem("JumboMaggi", price, 3);
        System.out.println("Total price : " + totalPrice);

    }
}