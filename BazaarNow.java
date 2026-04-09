class BazaarNow{
    public static void main(String[] args){
        String[] instantItems={"Milk","Bread","Eggs","Curd","Butter",
                "Paneer","Cheese","Juice","Water Bottle","Soft Drink",
                "Maggi","Noodles","Pasta","Poha","Upma Mix"};

        String[] snacks={"Chips","Biscuits","Chocolate","Cake","Namkeen"};
        String[] personalCare={"Soap","Shampoo","Face Wash","Toothpaste","Handwash"};
        String[] homeNeeds={"Bucket","Mug","Dustbin","Hanger","Cloth Clips"};
        String[] kitchen={"Plate","Glass","Bowl","Spoon","Knife"};

        System.out.println("Instant Items");
        System.out.println("0:"+instantItems[0]);
        System.out.println("1:"+instantItems[1]);
        System.out.println("2:"+instantItems[2]);
        System.out.println("3:"+instantItems[3]);
        System.out.println("4:"+instantItems[4]);
        System.out.println("5:"+instantItems[5]);
        System.out.println("6:"+instantItems[6]);
        System.out.println("7:"+instantItems[7]);
        System.out.println("8:"+instantItems[8]);
        System.out.println("9:"+instantItems[9]);
        System.out.println("10:"+instantItems[10]);
        System.out.println("11:"+instantItems[11]);
        System.out.println("12:"+instantItems[12]);
        System.out.println("13:"+instantItems[13]);
        System.out.println("14:"+instantItems[14]);

        System.out.println("Snacks");
		
    for(int i=0;i<snacks.length;i++) {
            System.out.println(snacks[i]);
        }

        System.out.println("Personal Care");
		
        for(String x:personalCare){
            System.out.println(x);
        }

        System.out.println("Home Needs");
		
        for(int i=0;i<homeNeeds.length;i++) {
            System.out.println(homeNeeds[i]);
        }

        System.out.println("Kitchen");
		
        for(String y:kitchen){
            System.out.println(y);
        }
    }
}