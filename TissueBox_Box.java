class TissueBox_Box {

    public static void main(String[] args) {

        TissueBoxService.Banda();

        TissueBoxService.tissueDetails("SoftCare", "White");

        int boxCount = TissueBoxService.getBoxCount();
        System.out.println("Total Tissue Boxes : " + boxCount);

        int totalTissues = TissueBoxService.totalTissueSheets(50, 100);
        System.out.println("Total Tissue Sheets : " + totalTissues);
    }
}