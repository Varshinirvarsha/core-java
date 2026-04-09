class MedPlus{
    public static void main(String[] args){
        String[] tablets={"Paracetamol","Dolo 650","Crocin","Azithromycin","Cetrizine",
                "Vitamin C","Calcium","Iron","Zinc","B Complex","Pantop","Rantac","Gelusil","Combiflam","Disprin"};

        String[] syrups={"Cough Syrup","Ascoril","Benadryl","Corex"};
        String[] firstAid={"Bandage","Cotton","Dettol","Savlon"};
        String[] babyCare={"Baby Lotion","Baby Oil","Diapers"};
        String[] devices={"Thermometer","BP Machine","Oximeter"};

        System.out.println("Tablets");
        System.out.println("0:"+tablets[0]);
        System.out.println("1:"+tablets[1]);
        System.out.println("2:"+tablets[2]);
        System.out.println("3:"+tablets[3]);
        System.out.println("4:"+tablets[4]);
        System.out.println("5:"+tablets[5]);
        System.out.println("6:"+tablets[6]);
        System.out.println("7:"+tablets[7]);
        System.out.println("8:"+tablets[8]);
        System.out.println("9:"+tablets[9]);
        System.out.println("10:"+tablets[10]);
        System.out.println("11:"+tablets[11]);
        System.out.println("12:"+tablets[12]);
        System.out.println("13:"+tablets[13]);
        System.out.println("14:"+tablets[14]);

        System.out.println("Syrups");
		
   for(int i=0;i<syrups.length;i++)
        {
            System.out.println(syrups[i]);
        }

        System.out.println("First Aid");
   for(String x:firstAid)
        {
            System.out.println(x);
        }

        System.out.println("Baby Care");
   for(int i=0;i<babyCare.length;i++)
        {
         System.out.println(babyCare[i]);
        }
 
           System.out.println("Devices");
  for(String y:devices)
        {
           System.out.println(y);
        }
    }
}