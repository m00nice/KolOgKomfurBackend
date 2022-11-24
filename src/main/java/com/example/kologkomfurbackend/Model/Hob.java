package com.example.kologkomfurbackend.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@MappedSuperclass
public abstract class Hob extends Product{

    private int hobAmount;
    private String controls;
    private String hobDescription;


}
