class Zudio{
    public static void main(String[] args){
        String[] tops={
                "Crop Top","Printed Top","Casual Top","Full Sleeve Top","Tank Top",
                "Peplum Top","Floral Top","Party Top","Cotton Top","Linen Top",
                "V Neck Top","Round Neck Top","Striped Top","Loose Fit Top","Short " };

        String[] bottoms={"Jeans","Skirt","Palazzo","Track Pant","Shorts","Cargo","Denim","Leggings"};

        String[] ethnic={"Kurti","Anarkali","Dupatta","Churidar","Ethnic Set","Palazzo Set"};

        String[] winter={"Hoodie","Sweater","Jacket","Shrug","Cardigan"};

        String[] accessories={"Scarf","Hairband","Cap","Socks","Belt","Handbag"};

        System.out.println("Tops");
        System.out.println("0:"+tops[0]);
        System.out.println("1:"+tops[1]);
        System.out.println("2:"+tops[2]);
        System.out.println("3:"+tops[3]);
        System.out.println("4:"+tops[4]);
        System.out.println("5:"+tops[5]);
        System.out.println("6:"+tops[6]);
        System.out.println("7:"+tops[7]);
        System.out.println("8:"+tops[8]);
        System.out.println("9:"+tops[9]);
        System.out.println("10:"+tops[10]);
        System.out.println("11:"+tops[11]);
        System.out.println("12:"+tops[12]);
        System.out.println("13:"+tops[13]);
        System.out.println("14:"+tops[14]);

    System.out.println("Bottoms");
        for(int i=0;i<bottoms.length;i++)
        {
            System.out.println(bottoms[i]);
        }

              System.out.println("Ethnic");
      for(String x:ethnic)
        {
            System.out.println(x);
        }

             System.out.println("Winter");
    for(int i=0;i<winter.length;i++)
        {
            System.out.println(winter[i]);
        }

             System.out.println("Accessories");
    for(String y:accessories)
        {
            System.out.println(y);
        }
    }
}