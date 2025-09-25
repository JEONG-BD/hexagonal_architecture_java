package com.example.demo.domain.vo;

public class Network {
    private IP address; 
    private String name;
    private int cidr;
    
    public Network(IP address, String name, int cidr) {
        if (cidr < 0 || cidr > 32) {
            throw new IllegalArgumentException("CIDR must be between 0 and 32");
        }
        
        this.address = address;
        this.name = name;
        this.cidr = cidr;
    }

    public IP getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getCidr() {
        return cidr;
    }

    @Override
    public String toString() {
        return "Network [address=" + address + ", name=" + name + ", cidr=" + cidr + "]";
    } 

    

    
}
