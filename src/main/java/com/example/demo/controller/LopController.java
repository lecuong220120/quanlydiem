package com.example.demo.controller;

import com.example.demo.entity.DiemThi;
import com.example.demo.entity.Lop;
import com.example.demo.service.LopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/lop")
public class LopController {
    @Autowired
    LopService lopService;
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
    @PutMapping
    public  ResponseEntity<?> update (@RequestBody Lop Lop){
        return new ResponseEntity<>(lopService.update(Lop), HttpStatus.OK);
    }
}
