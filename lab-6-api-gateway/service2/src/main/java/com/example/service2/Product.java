package com.example.service2;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Product implements Serializable {
    private String name;
    private int quantity;
}