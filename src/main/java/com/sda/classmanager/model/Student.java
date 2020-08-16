package com.sda.classmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String lastName;
    private int yearBorn;
    private boolean quarantined;
    private Gender gender;

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
