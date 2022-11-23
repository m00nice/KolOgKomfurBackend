package com.example.kologkomfurbackend.Model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "function")
public class Function {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;

}
