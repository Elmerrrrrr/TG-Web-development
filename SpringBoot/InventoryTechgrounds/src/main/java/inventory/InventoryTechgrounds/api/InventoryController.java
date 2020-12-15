package inventory.InventoryTechgrounds.api;

import inventory.InventoryTechgrounds.model.Inventory;
import inventory.InventoryTechgrounds.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {


    //GET all inventory items
    @RequestMapping("/inventory")
    public List<Inventory> getAllInventory(){
        System.out.println("GetAllInventory request..");
        return InventoryService.getAllInventory();
    }

    //GET single inventory Item
    @RequestMapping("/inventory/{id}")
    public Inventory getAllInventory(@PathVariable String id){
        System.out.println("GetInventory request itemnr: " + id);
        return InventoryService.getId(id);
    }


   //POST new inventory item
   @RequestMapping(method=RequestMethod.POST, value="/inventory")
   public Object addInventory(@RequestBody Inventory item ) {
        System.out.println("POST REQUEST..");
        InventoryService.addInventory(item);

        String response = "{\"success\": true, \"message\": The inventory item has been added successfully.}";
        return response;
   }

    //UPDATE new inventory item
    @RequestMapping(method=RequestMethod.PUT, value="/inventory/{id}")
    public String updateInventory(@RequestBody Inventory item, @PathVariable String id ) {
        System.out.println("UPDATE REQUEST for item nr: " + id );
        InventoryService.updateInventory(id, item);

        String response = "{\"success\": true, \"message\": The inventory item has been updated successfully.}";
        return response;
    }

    //DELETE inventory item
    @RequestMapping(method=RequestMethod.DELETE, value="/inventory/{id}")
    public String updateInventory(@PathVariable String id ) {
        System.out.println("DELETE REQUEST for item nr: " + id );
        InventoryService.deleteInventory(id);

        String response = "{\"success\": true, \"message\": The inventory item has been deleted successfully.}";
        return response;
    }


}
