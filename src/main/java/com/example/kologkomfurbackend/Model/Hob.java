package com.example.kologkomfurbackend.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class Hob extends Product{

    private int hobAmount;
    private boolean childSafety;

}
