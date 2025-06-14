package com.sves.busDetails.controller;

import com.sves.busDetails.entity.busEntity;
//import com.sves.busDetails.entity.busT;
import com.sves.busDetails.service.busService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class busController {

    @Autowired
    private busService busService;

    @GetMapping("/")
    public List<busEntity> getall() {
        return busService.getall();
    }

    @PostMapping("/busin")
    public String upload(@RequestBody busEntity bus) {
        busService.upload(bus);
        return "Bus data uploaded successfully";
    }
}
