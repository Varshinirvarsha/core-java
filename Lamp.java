class Lamp {
    public static void main(String[] args) {

        String color;
        int watt;
        float height;
        boolean isLED;
        char type;

        color = "White";
        watt = 12;
        height = 25.5f;
        isLED = true;
        type = 'S';

        System.out.println("Initial Color: " + color);
        System.out.println("Initial Watt: " + watt);
        System.out.println("Initial Height: " + height);
        System.out.println("Initial LED: " + isLED);
        System.out.println("Initial Type: " + type);

        color = "Grey";
        watt = 18;
        height = 30.0f;
        isLED = false;
        type = 'B';

        System.out.println("Updated Color: " + color);
        System.out.println("Updated Watt: " + watt);
        System.out.println("Updated Height: " + height);
        System.out.println("Updated LED: " + isLED);
        System.out.println("Updated Type: " + type);
    }
}