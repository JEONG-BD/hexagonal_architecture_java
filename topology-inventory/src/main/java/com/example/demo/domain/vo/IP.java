package com.example.demo.domain.vo;

public class IP {
    private String address;
    private Protocol protocol;
    
    public IP(String address) {
        if (address == null) {
            throw new IllegalArgumentException("Invalid IP address format");
        }
        this.address = address;
    
        if (address.length() <= 15){
            this.protocol = Protocol.IPv4;
        } else{
            this.protocol = Protocol.IPv6;
        }
    }

    public String getAddress() {
        return address;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    @Override
    public String toString() {
        return "IP [address=" + address + ", protocol=" + protocol + "]";
    }

    

    

}
