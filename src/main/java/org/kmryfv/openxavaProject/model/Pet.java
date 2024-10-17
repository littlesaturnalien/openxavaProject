package org.kmryfv.openxavaProject.model;

import org.openxava.model.Identifiable;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pet extends Identifiable {
    @Column(length=50) @Required
    String name;
    String description;
    @Column(length=50,nullable=false)
    String breed;
    @Column(length=50,nullable=false)
    LocalDate birthDate;
}
