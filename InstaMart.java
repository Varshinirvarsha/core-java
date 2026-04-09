class InstaMart{
    public static void main(String[] args){
        String[] quickDelivery={"Milk Packet","Bread","Eggs","Curd","Butter",
                "Paneer","Cheese","Juice","Soft Drink","Water Bottle",
                "Maggi","Noodles","Pasta","Poha","Upma Mix"
 };
        String[] beverages={"Coke","Pepsi","Sprite","Fanta","Maaza","Frooti"};
		String[] personalCare={"Face Wash","Body Lotion","Shampoo","Soap","Hand Wash"};
		String[] homeNeeds={"Bucket","Mug","Dustbin","Hanger","Cloth Clip"};
		String[] babyCare={"Diapers","Baby Wipes","Baby Powder","Baby Soap"};

        System.out.println("Quick Delivery");
        System.out.println("0:"+quickDelivery[0]);
        System.out.println("1:"+quickDelivery[1]);
        System.out.println("2:"+quickDelivery[2]);
        System.out.println("3:"+quickDelivery[3]);
        System.out.println("4:"+quickDelivery[4]);
        System.out.println("5:"+quickDelivery[5]);
        System.out.println("6:"+quickDelivery[6]);
        System.out.println("7:"+quickDelivery[7]);
        System.out.println("8:"+quickDelivery[8]);
        System.out.println("9:"+quickDelivery[9]);
        System.out.println("10:"+quickDelivery[10]);
        System.out.println("11:"+quickDelivery[11]);
        System.out.println("12:"+quickDelivery[12]);
        System.out.println("13:"+quickDelivery[13]);
        System.out.println("14:"+quickDelivery[14]);

        System.out.println("Beverages");
		
      for(int i=0;i<beverages.length;i++){
            System.out.println(beverages[i]);
        }

        System.out.println("Personal Care");
		
   for(String x:personalCare){
            System.out.println(x);
     }

          System.out.println("Home Needs");
		  
    for(int i=0;i<homeNeeds.length;i++) {
            System.out.println(homeNeeds[i]);
      }

        System.out.println("Baby Care");
   for(String y:babyCare) {
            System.out.println(y);
     }
  }
}