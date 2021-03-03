package com.example.webaws.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter // 1
@RequiredArgsConstructor // 2
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
