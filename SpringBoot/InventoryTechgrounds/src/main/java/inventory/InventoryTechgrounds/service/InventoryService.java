package inventory.InventoryTechgrounds.service;

import inventory.InventoryTechgrounds.model.Inventory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InventoryService {



    private static List<Inventory> inventoryList =new ArrayList<>(Arrays.asList(
            new Inventory("1","Acer", "DX-800",1500),
            new Inventory("2","Dell", "XS-500",1000),
            new Inventory("3","Apple", "McBook",4000),
            new Inventory("4","Lenovo", "8800KZ",2500)
    ));


    //GET all items
    public static List<Inventory> getAllInventory() {
        return inventoryList;
    }

    //GET one item
    public static Inventory getId(String id){
        return inventoryList.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }

    //POST
    public static void addInventory(Inventory item) {
        inventoryList.add(item);
        System.out.println("Added net item to the list!");
    }

    //UPDATE
    public static void updateInventory(String id, Inventory item) {
        for(int i= 0; i<inventoryList.size(); i++){
            Inventory itemCheck = inventoryList.get(i);
            if(itemCheck.getId().equals(id)){
                inventoryList.set(i, item);
                return; //when found and set return
            }
        }
        System.out.println("Updated the list!");
    }

    //DELETE item
    public static void deleteInventory(String id) {
        inventoryList.removeIf(item -> item.getId().equals(id));
    }
}
