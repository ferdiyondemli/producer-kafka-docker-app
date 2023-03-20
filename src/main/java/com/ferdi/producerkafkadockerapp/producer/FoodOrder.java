package com.ferdi.producerkafkadockerapp.producer;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class FoodOrder {
    String item;
    Double amount;
}