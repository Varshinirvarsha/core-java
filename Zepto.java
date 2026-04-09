class Zepto{
    public static void main(String[] args) {
        String[] quickItems={"Milk","Curd","Paneer","Butter","Cheese","Bread","Eggs","Juice","Water Bottle","Soft Drink",
                "Tomato","Onion","Potato","Banana","Apple"};

        String[] snacks={"Chips","Biscuits","Chocolate","Cake","Namkeen"};
        String[] personalCare={"Soap","Shampoo","Face Wash","Toothpaste","Hand Wash"};
        String[] readyToCook={"Maggi","Noodles","Pasta","Poha","Upma Mix"};
        String[] homeNeeds={"Bucket","Mug","Dustbin","Hanger","Cloth Clips"};

        System.out.println("Quick Items");
        System.out.println("0:"+quickItems[0]);
        System.out.println("1:"+quickItems[1]);
        System.out.println("2:"+quickItems[2]);
        System.out.println("3:"+quickItems[3]);
        System.out.println("4:"+quickItems[4]);
        System.out.println("5:"+quickItems[5]);
        System.out.println("6:"+quickItems[6]);
        System.out.println("7:"+quickItems[7]);
        System.out.println("8:"+quickItems[8]);
        System.out.println("9:"+quickItems[9]);
        System.out.println("10:"+quickItems[10]);
        System.out.println("11:"+quickItems[11]);
        System.out.println("12:"+quickItems[12]);
        System.out.println("13:"+quickItems[13]);
        System.out.println("14:"+quickItems[14]);

   System.out.println("Snacks");
        for(int i=0;i<snacks.length;i++) {
            System.out.println(snacks[i]);
        }

        System.out.println("Personal Care");
		
        for(String x:personalCare){
            System.out.println(x);
        }

        System.out.println("Ready To Cook");
		
   for(int i=0;i<readyToCook.length;i++) {
            System.out.println(readyToCook[i]);
        }

        System.out.println("Home Needs");
		
  for(String y:homeNeeds) {
            System.out.println(y);
     }
 }
}