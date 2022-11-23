package com.example.demo.controller;

import com.example.demo.entity.DiemThi;
import com.example.demo.service.DiemThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/diemthi")
public class DiemThiController {
    @Autowired
    DiemThiService diemThiService;
    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(diemThiService.findAll(), HttpStatus.OK) ;
    }
    @PostMapping
    public ResponseEntity<?> save (@RequestBody DiemThi diemThi){
        return new ResponseEntity<>(diemThiService.save(diemThi), HttpStatus.OK);
    }
    @DeleteMapping
    public  void delete(@RequestBody DiemThi diemThi){
        diemThiService.delete(diemThi);
    }
    @PutMapping
    public  ResponseEntity<?> update (@RequestBody DiemThi diemThi){
        return new ResponseEntity<>(diemThiService.update(diemThi), HttpStatus.OK);
    }
}
