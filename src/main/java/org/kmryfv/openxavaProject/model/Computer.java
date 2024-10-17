package org.kmryfv.openxavaProject.model;

import java.time.*;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Computer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private LocalDate release_date;
    private int ram;
    private int rom;
    private String computer_type;
}
