class BigBazaar{
    public static void main(String[] args){
        String[] groceries={"Rice","Wheat","Sugar","Salt","Oil",
                "Toor Dal","Urad Dal","Chana Dal","Rava","Maida",
                "Besan","Poha","Corn Flour","Sooji","Sabudana"};

   String[] household={"Bucket","Mug","Dustbin","Cloth Stand","Hanger","Doormat"};
   String[] kitchen={"Pressure Cooker","Tawa","Kadai","Pan","Knife","Spatula"};
  String[] personalCare={"Soap","Shampoo","Toothpaste","Face Wash","Body Lotion"};
  String[] beverages={"Tea","Coffee","Milk","Juice","Soft Drink"};

        System.out.println("Groceries");
        System.out.println("0:"+groceries[0]);
        System.out.println("1:"+groceries[1]);
        System.out.println("2:"+groceries[2]);
        System.out.println("3:"+groceries[3]);
        System.out.println("4:"+groceries[4]);
        System.out.println("5:"+groceries[5]);
        System.out.println("6:"+groceries[6]);
        System.out.println("7:"+groceries[7]);
        System.out.println("8:"+groceries[8]);
        System.out.println("9:"+groceries[9]);
        System.out.println("10:"+groceries[10]);
        System.out.println("11:"+groceries[11]);
        System.out.println("12:"+groceries[12]);
        System.out.println("13:"+groceries[13]);
        System.out.println("14:"+groceries[14]);

        System.out.println("Household");
		
        for(int i=0;i<household.length;i++){
            System.out.println(household[i]);
        }

        System.out.println("Kitchen");
		
        for(String x:kitchen) {
            System.out.println(x);
        }

        System.out.println("Personal Care");
        for(int i=0;i<personalCare.length;i++){
            System.out.println(personalCare[i]);
        }

        System.out.println("Beverages");
		
        for(String y:beverages){
            System.out.println(y);
        }
    }
}