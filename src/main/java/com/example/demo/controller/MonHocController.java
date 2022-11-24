package com.example.demo.controller;

import com.example.demo.entity.MonHoc;
import com.example.demo.entity.SinhVien;
import com.example.demo.service.MonHocService;
import com.example.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin("*")
public class MonHocController {
    @Autowired
    MonHocService monHocService;
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(monHocService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> save (@RequestBody MonHoc monHoc){
        return new ResponseEntity<>(monHocService.save(monHoc), HttpStatus.OK);
    }
    @DeleteMapping
    public  void delete(@RequestBody MonHoc monHoc){
        monHocService.delete(monHoc);
    }
    @PutMapping
    public  ResponseEntity<?> update (@RequestBody MonHoc monHoc){
        return new ResponseEntity<>(monHocService.update(monHoc), HttpStatus.OK);
    }
}
