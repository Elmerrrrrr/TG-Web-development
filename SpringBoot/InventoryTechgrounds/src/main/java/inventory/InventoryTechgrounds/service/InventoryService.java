package inventory.InventoryTechgrounds.service;

import inventory.InventoryTechgrounds.model.Inventory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InventoryService {



    private static List<Inventory> inventoryList =new ArrayList<>(Arrays.asList(
            new Inventory(1,"Acer", "DX-800",1500),
            new Inventory(2,"Dell", "XS-500",1000),
            new Inventory(3,"Apple", "McBook",4000),
            new Inventory(4,"Lenovo", "8800KZ",2500)
    ));



    public static List<Inventory> getAllInventory() {

        return inventoryList;

    }

    public static void updateInventory() {
        inventoryList.add(new Inventory(5, "NewLaptop", "NewModel", 5000  ));
        System.out.println("Updated the list!");


    }
}
