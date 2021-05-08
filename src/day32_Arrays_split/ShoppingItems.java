package day32_Arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("---------FIND THE INDEX OF 'Gloves' IN ITEMS ARRAY ---------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Index of Gloves: " + i);
                break;
            }
        }
        System.out.println("---------SET BOOLEAN TO TRUE IF IPAD EXISTS ---------");
        boolean iPadExists = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].contains("iPad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPad exists " + iPadExists);
        System.out.println("--------Print a report of each shopping item --------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
            break;
        }
        System.out.println("-----LOOK FOR JACKET -------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break;
            }
        }
    }
}


