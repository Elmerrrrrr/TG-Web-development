package inventory.InventoryTechgrounds.api;

import inventory.InventoryTechgrounds.model.Inventory;
import inventory.InventoryTechgrounds.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

//    @RequestMapping("/")
//    public  getAllInventory(){
//
//        return "index";
//    }

    @RequestMapping("/inventory")
    public List<Inventory> getAllInventory(){
        System.out.println("GetAllInventory request..");
        return InventoryService.getAllInventory();
    }


    @RequestMapping(method=RequestMethod.POST, value="/inventory/")
   public String updateInventory() {
        System.out.println("Check!");
        InventoryService.updateInventory();

        String response = "{\"success\": true, \"message\": Topic has been updated successfully.}";
        return response;
    }




}
