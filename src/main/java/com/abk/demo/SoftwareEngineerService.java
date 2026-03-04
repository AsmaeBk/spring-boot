package com.abk.demo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SoftwareEngineerService {
    
    private SoftwareEngineerRepo softwareEngineerRepo;
    
    public SoftwareEngineerService(SoftwareEngineerRepo softwareEngineerRepo) {
        this.softwareEngineerRepo = softwareEngineerRepo;
    }
    
    public List<SoftwareEngineer> getAllEngineers() {
        return softwareEngineerRepo.findAll();
    }


    public void addSoftwareEngineer(SoftwareEngineer entity) {
        softwareEngineerRepo.save(entity);
    }

    public SoftwareEngineer getEngineer(Integer id) {
        
        return softwareEngineerRepo.findById(id).orElseThrow(()->new IllegalStateException(id +" doesn't exist"));
         
    }

    public void deleteEngineer(Integer id) {
        softwareEngineerRepo.deleteById(id);
    }

    public void updateSoftwareEngineer(SoftwareEngineer entity) {
        if(!softwareEngineerRepo.existsById(entity.getId())) {
            throw new IllegalStateException(entity.getId() +" doesn't exist");
        }
        softwareEngineerRepo.save(entity);
    }
}
