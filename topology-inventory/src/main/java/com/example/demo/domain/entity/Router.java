package com.example.demo.domain.entity;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.demo.domain.vo.Network;
import com.example.demo.domain.vo.RouterId;
import com.example.demo.domain.vo.RouterType;

public class Router {

    private RouterType routerType;
    private RouterId routerId;
    private Switch networkSwitch;

    public Router(RouterType routerType, RouterId routerId) {
        this.routerType = routerType;
        this.routerId = routerId;
    } 

        public static Predicate<Router> filterRouterByType(RouterType routerType){
        return routerType.equals(RouterType.CORE)
                ? isCore() :
                isEdge();
    }

    private static Predicate<Router> isCore(){
        return p -> p.getRouterType() == RouterType.CORE;
    }

    private static Predicate<Router> isEdge(){
        return p -> p.getRouterType() == RouterType.EDGE;
    }

    public static List<Router> retrieveRouter(List<Router> routers, Predicate<Router> predicate){
        return routers.stream()
                .filter(predicate)
                .collect(Collectors.<Router>toList());
    }

    public RouterType getRouterType(){
        return routerType;
    }

    @Override
    public String toString(){
        return "Router{" +
                "routerType=" + routerType +
                ", routerId=" + routerId +
                '}';
    }

    public List<Network> retrieveRouter() {
        return networkSwitch.getNetworks();
    }

    

    
}
