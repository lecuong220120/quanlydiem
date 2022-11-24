package com.example.demo.controller;

import com.example.demo.entity.Lop;
import com.example.demo.entity.SinhVien;
import com.example.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/sinhvien")
@CrossOrigin("*")
public class SinhVienController {
    @Autowired
    SinhVienService sinhVienService;
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(sinhVienService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> save (@RequestBody SinhVien sinhvien){
        return new ResponseEntity<>(sinhVienService.save(sinhvien), HttpStatus.OK);
    }
    @DeleteMapping
    public  void delete(@RequestBody SinhVien sinhvien){
        sinhVienService.delete(sinhvien);
    }
    @PutMapping
    public  ResponseEntity<?> update (@RequestBody SinhVien sinhvien){
        return new ResponseEntity<>(sinhVienService.update(sinhvien), HttpStatus.OK);
    }
}
