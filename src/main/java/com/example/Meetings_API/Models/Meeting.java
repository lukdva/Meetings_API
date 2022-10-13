package com.example.Meetings_API.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Meeting {
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Person responsiblePerson;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private Category category;
    @Getter @Setter
    private Type type;
    @Getter @Setter
    private Date startDate;
    @Getter @Setter
    private Date endDate;
    @Getter @Setter
    private ArrayList<Attendee> attendees = new ArrayList<>();

    public Meeting() {
        this.id = UUID.randomUUID().toString();
    }
}
