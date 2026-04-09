class SmartBazaar{
    public static void main(String[] args) {
        String[] vegetables={"Tomato","Potato","Onion","Carrot","Beans",
                "Cabbage","Cauliflower","Capsicum","Beetroot","Radish",
                "Brinjal","Cucumber","Pumpkin","Drumstick","Peas"};

        String[] fruits={"Apple","Banana","Orange","Grapes","Papaya","Guava"};

        String[] dairy={"Milk","Curd","Butter","Paneer","Cheese"};

        String[] bakery={"Bread","Bun","Cake","Rusk","Garlic Bread"};

        String[] frozen={"Ice Cream","Frozen Peas","Corn","French Fries","Nuggets"};

        System.out.println("Vegetables");
        System.out.println("0:"+vegetables[0]);
        System.out.println("1:"+vegetables[1]);
        System.out.println("2:"+vegetables[2]);
        System.out.println("3:"+vegetables[3]);
        System.out.println("4:"+vegetables[4]);
        System.out.println("5:"+vegetables[5]);
        System.out.println("6:"+vegetables[6]);
        System.out.println("7:"+vegetables[7]);
        System.out.println("8:"+vegetables[8]);
        System.out.println("9:"+vegetables[9]);
        System.out.println("10:"+vegetables[10]);
        System.out.println("11:"+vegetables[11]);
        System.out.println("12:"+vegetables[12]);
        System.out.println("13:"+vegetables[13]);
        System.out.println("14:"+vegetables[14]);

   System.out.println("Fruits");
   
     for(int i=0;i<fruits.length;i++){
         System.out.println(fruits[i]);
        }

        System.out.println("Dairy");
     for(String x:dairy) {
          System.out.println(x);
        }

        System.out.println("Bakery");
    for(int i=0;i<bakery.length;i++) {
            System.out.println(bakery[i]);
        }

        System.out.println("Frozen");
 for(String y:frozen){
            System.out.println(y);
        }
    }
}