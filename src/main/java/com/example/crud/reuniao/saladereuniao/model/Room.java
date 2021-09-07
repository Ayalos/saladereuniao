package com.example.crud.reuniao.saladereuniao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="meetingroon")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name", nullable=false)
    private String name;
    @Column(name="date", nullable=false)
    private String date;
    @Column(name="startHour", nullable=false)
    private String startHour;
    @Column(name="endHour", nullable=false)
    private String endHour;

    @Override
    public String toString(){
        return "Room [Id: " + id + ", Name: "+name+", StartHour: " +startHour+", EndHour: " + endHour+"]";
    }
}
