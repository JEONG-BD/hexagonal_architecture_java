package com.example.demo.domain.service;

import com.example.demo.domain.entity.Event;
import com.example.demo.domain.vo.ParsePolicyType;

import java.util.ArrayList;
import java.util.List;

public class EventSearch {
    public List<Event> retrieveEvents(List<String> unparsedEvents, ParsePolicyType policyType){
        List<Event> parsedEvents = new ArrayList<>();
        unparsedEvents.stream().forEach(event ->{
            parsedEvents.add(Event.parsedEvent(event, policyType));
        });
        return parsedEvents;
    }
}
