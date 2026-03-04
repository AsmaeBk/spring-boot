package com.abk.demo;
import org.springframework.web.bind.annotation.*;
import java.util.List;





@RestController
@RequestMapping("/api/engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    // get only name and teckStack of all engineers
    @GetMapping
    public List<SoftwareEngineer> getAllEngineers() {
        return softwareEngineerService.getAllEngineers();
    }


    // Method to handle GET request to retrieve a SoftwareEngineer by ID
    @GetMapping("{id}")
    public SoftwareEngineer getEngineer(@PathVariable Integer id) {
        return softwareEngineerService.getEngineer(id);
    }

    // Method to handle POST request to create a new SoftwareEngineer
    @PostMapping
    public void addSoftwareEngineer(@RequestBody SoftwareEngineer entity) {
        softwareEngineerService.addSoftwareEngineer(entity);
    }

    @DeleteMapping("{id}")
    public void deleteEngineer(@PathVariable Integer id) {
        softwareEngineerService.deleteEngineer(id);
    }

    @PutMapping("{id}")
    public void updateSoftwareEngineer(@PathVariable Integer id, @RequestBody SoftwareEngineer entity) {
        entity.setId(id);
        softwareEngineerService.updateSoftwareEngineer(entity);
    }
    
}