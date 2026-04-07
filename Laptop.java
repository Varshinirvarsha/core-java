class Laptop {
        int getRam() {
        int ram = 16;
        return ram;
    }
void showBrand(String name) 
{
    System.out.println("Laptop Brand: " + name);
        int r = getRam();
           System.out.println("RAM: " + r + "GB");
    }
void display()
 {
    System.out.println("Laptop Info");
        showBrand("Dell");
    }
}
