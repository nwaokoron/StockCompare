package com.ProSpective.StockCompare.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Greeting {
    private final long id;
    private final String content;
}
