class SmartPoint {

    String deviceName;
    String brand;
    int price;
    boolean warranty;


    public SmartPoint(String deviceName, String brand, int price, boolean warranty) {
        this.deviceName = deviceName;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
		        System.out.println("-------------------");

    }

    public SmartPoint(String deviceName, int price) {
        this.deviceName = deviceName;
        this.price = price;
		        System.out.println("-------------------");

    }

    public SmartPoint(String brand) {
        this.brand = brand;
		        System.out.println("-------------------");
    }

    public void display() {
        System.out.println(deviceName);
        System.out.println(brand);
        System.out.println(price);
        System.out.println(warranty);
        System.out.println("-------------------");
    }
}