class DominosRunner {

    public static void main(String[] args) {

        int price = 0;

        price = Dominos.checkItem("Margherita");
        totalPrice = Dominos.checkItem("Margherita", price, 2);
        System.out.println(totalPrice);

        price = Dominos.checkItem("PeppyPaneer");
        totalPrice = Dominos.checkItem("PeppyPaneer", price, 1);
        System.out.println(totalPrice);

        price = Dominos.checkItem("Farmhouse");
        totalPrice = Dominos.checkItem("Farmhouse", price, 3);
        System.out.println(totalPrice);

        
    }
}