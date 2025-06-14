package com.sves.busDetails.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "busT")
public class busEntity {

    @Id
    private String busno;
    private String busid;
    private String startpoint;
    private String endpoint;
    private String drivername;

    // Default constructor
    public busEntity() {}

    // Optional: Constructor with all fields (useful for testing or object creation)
    public busEntity(String busno, String busid, String startpoint, String endpoint, String drivername) {
        this.busno = busno;
        this.busid = busid;
        this.startpoint = startpoint;
        this.endpoint = endpoint;
        this.drivername = drivername;
    }

    // Getters
    public String getBusno() {
        return busno;
    }

    public String getBusid() {
        return busid;
    }

    public String getStartpoint() {
        return startpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getDrivername() {
        return drivername;
    }

    // Setters
    public void setBusno(String busno) {
        this.busno = busno;
    }

    public void setBusid(String busid) {
        this.busid = busid;
    }

    public void setStartpoint(String startpoint) {
        this.startpoint = startpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }
}
