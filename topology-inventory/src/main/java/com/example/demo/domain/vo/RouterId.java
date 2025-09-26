package com.example.demo.domain.vo;

import java.util.UUID;

public class RouterId {


    //private final String id;
    private final UUID id;

    // public RouterId(String id) {
    //     this.id = id;
    // }

    public RouterId(UUID id) {
        this.id = id;
    }

        
    // public static RouterId of(String id) {
    //     return new RouterId(id);
    // }

    public static RouterId withId(String id) {
        return new RouterId(UUID.fromString(id));
    }

    public static RouterId withOutId() {
        return new RouterId(UUID.randomUUID());
    }

    @Override
    public String toString() {
        return "RouterId{" +
                "id='" + id + '\'' +
                '}';
    }

    public UUID getId() {
        return id;
    }
}
