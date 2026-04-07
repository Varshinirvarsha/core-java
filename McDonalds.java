class McDonalds {

    static int checkItem(String itemName) {

        int price = 0;

        if ("McAlooTikki" == itemName) {
			price = 59; 
			return price; 
			    }
        else if ("McVeggie" == itemName) {
			price = 129;
			return price;
      }
        else if ("McChicken" == itemName){
			price = 149; 
			  return price; 
			}
        else if ("McSpicyPaneer" == itemName) {
		price = 179; 
			return price;
			}
        else if ("McMaharaja" == itemName)
			{ price = 249; 
		return price; 
		}
        else if ("Fries" == itemName) {
			price = 99;
			return price; 
			}
        else if ("PeriPeriFries" == itemName) 
		{ price = 119;
	return price;
	}
        else if ("Coke" == itemName) { 
		price = 70;
		return price;
		}
        else if ("McFloat" == itemName)
			{ price = 89;
		return price; 
		}
        else if ("McFlurry" == itemName)
			{ price = 109;
		return price;
		}
        else if("HotCake" == itemName) { 
		price = 129; 
		return price; }
        else if ("Coffee" == itemName)
		{ price = 79;
	return price;
	}

        else { 
		return price;
		}
    }

    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("McAlooTikki" == itemName) { 
		totalPrice = price * noItems;
		return totalPrice;
		}
        else if ("McVeggie" == itemName)
		{ totalPrice = price * noItems; 
		return totalPrice;
		}
        else if ("McChicken" == itemName) { 
		totalPrice = price * noItems;
		return totalPrice;
		}
        else if ("McSpicyPaneer" == itemName) { 
		totalPrice = price * noItems; 
		return totalPrice; 
		}
        else if ("McMaharaja" == itemName) {
		totalPrice = price * noItems;
		return totalPrice; 
		}
        else if ("Fries" == itemName) {
		totalPrice = price * noItems;
		return totalPrice;
		}
        else if ("PeriPeriFries" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice;
		}
        else if ("Coke" == itemName) { 
		totalPrice = price * noItems;
		return totalPrice;
		}
        else if ("McFloat" == itemName) { 
		totalPrice = price * noItems; 
		return totalPrice; 
		}
        else if ("McFlurry" == itemName) { 
		totalPrice = price * noItems; 
		return totalPrice; 
		}
        else if ("HotCake" == itemName) { 
		totalPrice = price * noItems;
		return totalPrice;
		}
        else if ("Coffee" == itemName) {
		totalPrice = price * noItems; 
		return totalPrice; 
		}

        else { 
		return totalPrice; 
		}
    }
}