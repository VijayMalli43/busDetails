package com.sves.busDetails.service;

import com.sves.busDetails.entity.busEntity;
import com.sves.busDetails.repository.busrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class busService {

    @Autowired
    private busrepo busrepo;

    public List<busEntity> getall() {
        return busrepo.findAll();
    }

    public void upload(busEntity bus) {
        try {
            busrepo.save(bus);
        } catch (Exception e) {
            System.out.println("Error saving bus: " + e.getMessage());
        }
    }
}
