package com.example.demo.domain.entity;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.vo.IP;
import com.example.demo.domain.vo.Network;
import com.example.demo.domain.vo.SwitchId;
import com.example.demo.domain.vo.SwitchType;

public class Switch {
    private SwitchId switchId;
    private SwitchType switchType;
    private List<Network> networks;
    private IP address;
    

    public Switch(SwitchId switchId, SwitchType switchType, List<Network> networks, IP address) {
        this.switchId = switchId;
        this.switchType = switchType;
        this.networks = networks;
        this.address = address;
    }

    public Switch addSwitch(Network network, Router router){

        List<Network> newNetworks = new ArrayList<>();
        router.retrieveRouter().forEach(net -> {
            newNetworks.add(net);
        });

        newNetworks.add(network);
        return new Switch(this.switchId, this.switchType, newNetworks, this.address)
    }

    public SwitchId getSwitchId() {
        return switchId;
    }

    public SwitchType getSwitchType() {
        return switchType;
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public IP getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Switch [switchId=" + switchId + 
        ", switchType=" + switchType + 
        ", networks=" + networks + 
        ", address="+ address + "]";
    }

    

    

    
}
