class Zomato {

    static int checkItem(String itemName) {

        int price = 0;

        if ("Biryani" == itemName) {
		price = 220; 
		return price;
		}
        else if ("FriedRice" == itemName)
		{ price = 180; 
		return price; 
		}
        else if ("Noodles" == itemName) { 
		price = 160;
		return price; 
		}
        else if ("PaneerButterMasala" == itemName) { 
		price = 240;
		return price; 
		}
        else if ("ButterNaan" == itemName) {
		price = 40; 
		return price;
		}
        else if ("VegMeals" == itemName) { 
		price = 150; 
		return price;
		}
        else if ("CurdRice" == itemName) {
		price = 90;
		return price;
		}
        else if ("Parotta" == itemName) {
		price = 35; 
		return price;
		}
        else if ("GobiManchurian" == itemName) {
		price = 130; 
		return price;
		}
        else if ("Dosa" == itemName) {
		price = 70; 
		return price;
		}
        else if ("Idli" == itemName) {
		price = 50; return price; }
        else if ("Vada" == itemName) {
		price = 45; return price;
		}

        else { return price; }
    }

    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("Biryani" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice;
		}
        else if ("FriedRice" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice; 
		}
        else if ("Noodles" == itemName) {
		totalPrice = price * noItems;
		return totalPrice; 
		}
        else if ("PaneerButterMasala" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice;
		}
        else if ("ButterNaan" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice;
		}
        else if ("VegMeals" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice; 
		}
        else if ("CurdRice" == itemName) 
		{ totalPrice = price * noItems;
		return totalPrice;
		}
        else if ("Parotta" == itemName)
		{ totalPrice = price * noItems;
		return totalPrice;
		}
        else if ("GobiManchurian" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice;
		}
        else if ("Dosa" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice;
		}
        else if ("Idli" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice;
		}
        else if ("Vada" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice; }

        else { 
		return totalPrice;
		}
    }
}