package com.example.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GreetingResponse {
    private String greeting;
}
