class More{
    public static void main(String[] args){
        String[] groceries={
                "Rice","Wheat","Sugar","Salt","Oil",
                "Dal","Rava","Maida","Besan","Poha",
                "Tea","Coffee","Milk Powder","Corn Flour","Sooji"
        };

        String[] vegetables={"Tomato","Onion","Potato","Carrot","Beans"};

        String[] fruits={"Apple","Banana","Orange","Papaya"};

        String[] dairy={"Milk","Curd","Butter","Paneer"};

        String[] snacks={"Chips","Biscuits","Cake","Chocolate"};

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

        System.out.println("Vegetables");
		
		
    for(int i=0;i<vegetables.length;i++) {
            System.out.println(vegetables[i]);
        }

             System.out.println("Fruits");
      for(String x:fruits) {
            System.out.println(x);
        }

     System.out.println("Dairy");
	 
       for(int i=0;i<dairy.length;i++){
         System.out.println(dairy[i]);
        }

            System.out.println("Snacks");
     for(String y:snacks){
            System.out.println(y);
             }
  }
}