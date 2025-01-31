package org.example.invontoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder @ToString
public class Products {

    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}
