class EggsRunner {

    public static void main(String[] args) 
    {
        Eggs.brand();
        Eggs.setsize(455);

        int EggsPrice = Eggs.price();
        System.out.println("Price:" +EggsPrice);

        String EggsColor = Eggs.color("white");
        System.out.println("Color:" + EggsColor);
    }

}