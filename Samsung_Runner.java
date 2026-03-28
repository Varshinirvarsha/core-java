 class Mblile_Runner{

   public static void main(String[] args) {

        String[] m = getMobileNames();
        int[] p = getPrices();
        String[] c = getColors();
        int[] s = getStorage();
        int[] b = getBattery();

        for(int i = 0; i < 8; i++) {
			System.out.println("#########################");
			System.out.println("Mobile Name: " + m[i]);
            System.out.println("Price: " + p[i]);
            System.out.println("Color: " + c[i]);
            System.out.println("Storage: " + s[i] + "GB");
            System.out.println("Battery: " + b[i] + "mAh");
            System.out.println("############################");
        }
    }
}