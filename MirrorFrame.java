 class MirrorFrame {
    public static void main(String[] args) {

        String frameType;
        int height;
        float width;
        boolean isWood;
        char grade;

        frameType = "Classic";
        height = 40;
        width = 25.5f;
        isWood = true;
        grade = 'A';

        System.out.println("Initial Frame: " + frameType);
        System.out.println("Initial Height: " + height);
        System.out.println("Initial Width: " + width);
        System.out.println("Initial Wood: " + isWood);
        System.out.println("Initial Grade: " + grade);

        frameType = "Modern";
        height = 50;
        width = 30.0f;
        isWood = false;
        grade = 'B';

        System.out.println("Updated Frame: " + frameType);
        System.out.println("Updated Height: " + height);
        System.out.println("Updated Width: " + width);
        System.out.println("Updated Wood: " + isWood);
        System.out.println("Updated Grade: " + grade);
    }
}