class TissueBoxService {

    public static void Brand () {
        System.out.println("Welcome to Tissue Box Service");
    }

    static void tissueDetails(String brand, String color) {
        System.out.println("Tissue Brand : " + brand);
        System.out.println("Tissue Color : " + color);
    }

    static int getBoxCount() {
        return 5;
    }

    static int totalTissueSheets(int box1, int box2) {
        return box1 + box2;
    }
}