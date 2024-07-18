package staj.Controller;


import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import staj.Entity.StajEntity;
import staj.repo.Repository;
import java.util.List;
@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    private Repository stajRepository;
    @GetMapping
    public List <StajEntity> getAllben (){
        return this.stajRepository.findAll();
    }

    @GetMapping("/{ad}")
    public List <StajEntity> getByisim(@PathVariable (value = "isim") String ad) {
        return this.stajRepository.findByIsim(ad);
    }

    @PostMapping
    public StajEntity createStaj(@RequestBody StajEntity staj) {
        return this.stajRepository.save(staj);
    }

    @PutMapping("/{isim}")
    public List < StajEntity> updateStaj(@RequestBody StajEntity staj , @PathVariable String isim) {
        return this.stajRepository.findByIsim(isim);

    }







}

