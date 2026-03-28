 class Mobile_Runner{

   public static void main(String[] args) {

        String[] mobileNames = getMobileNames();
        int[] prices = getPrices();
        String[] color = getColors();
        int[] storage = getStorage();
        int[] battery = getBattery();

        for(int i = 0; i < 8; i++){
			System.out.println("#########################");
			System.out.println("Mobile Name: " + mobileNames[i]);
            System.out.println("Price: " + prices[i]);
            System.out.println("Color: " + color[i]);
            System.out.println("Storage: " + storage[i] + "GB");
            System.out.println("Battery: " + battery[i] + "mAh");
            System.out.println("############################");
        }
    }
}