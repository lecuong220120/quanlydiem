package com.example.demo.controller;

import com.example.demo.entity.DiemThi;
import com.example.demo.entity.Lop;
import com.example.demo.repository.LopRepository;
import com.example.demo.service.LopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/lop")
public class LopController {
    @Autowired
    LopService lopService;
    @Autowired
    LopRepository lopRepository;
    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(lopService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> save (@RequestBody Lop lop){
        return new ResponseEntity<>(lopService.save(lop), HttpStatus.OK);
    }
    @DeleteMapping
    public  void delete(@RequestBody Lop lop){
        lopService.delete(lop);
    }
    @PutMapping("/{id}")
    public  ResponseEntity<?> update (@RequestBody Lop Lop, @PathVariable(name = "id") Long id){
        Lop lopDb = lopRepository.findById(id).get();
        lopDb.setTenLop(lopDb.getTenLop());
        return new ResponseEntity<>(lopService.update(lopDb), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable(name = "id")  Long id){
        return new ResponseEntity<>(lopRepository.findById(id), HttpStatus.OK);
    }
}
