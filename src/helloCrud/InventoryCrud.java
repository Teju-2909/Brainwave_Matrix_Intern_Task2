package helloCrud;

import java.util.ArrayList;
import java.util.Scanner;

import hello.InventoryItem;


public class InventoryCrud {

    static ArrayList<InventoryItem> inventory = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public  void addItem() {
        
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter item code: ");
        String code = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        
        InventoryItem newItem = new InventoryItem(name, code, quantity, price);
        inventory.add(newItem);
        System.out.println("Item added successfully.");
    }

    
    public void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory List:");
            for (InventoryItem item : inventory) {
                item.displayItem();
            }
        }
    }

   
    public void updateInventory() {
       
        System.out.print("Enter item code to update: ");
        String code = scanner.nextLine();

        InventoryItem itemToUpdate = findItemByCode(code);
        if (itemToUpdate != null) {
            System.out.println("Item found.");
            System.out.println("1. Update Quantity");
            System.out.println("2. Update Price");
            System.out.print("Choose option (1/2): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter new quantity: ");
                int newQuantity = scanner.nextInt();
                itemToUpdate.setQuantity(newQuantity);
                System.out.println("Quantity updated successfully.");
            } else if (choice == 2) {
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();
                itemToUpdate.setPrice(newPrice);
                System.out.println("Price updated successfully.");
            } else {
                System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Item not found.");
        }
    }

   
    public void deleteItem() {
        System.out.print("Enter item code to delete: ");
        String code = scanner.nextLine();

        InventoryItem itemToDelete = findItemByCode(code);
        if (itemToDelete != null) {
            inventory.remove(itemToDelete);
            System.out.println("Item deleted successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

  
    private static InventoryItem findItemByCode(String code) {
        for (InventoryItem item : inventory) {
            if (item.getItemCode().equals(code)) {
                return item;
            }
        }
        return null; 
    }

  
    public void displayMenu() {
        while (true) {
            System.out.println("\nInventory Management Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. View Inventory");
            System.out.println("3. Update Item");
            System.out.println("4. Delete Item");
            System.out.println("5. Exit");
            System.out.print("Choose option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    viewInventory();
                    break;
                case 3:
                    updateInventory();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    System.out.println("Exiting inventory management.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
