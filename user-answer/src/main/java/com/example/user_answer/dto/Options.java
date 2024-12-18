package com.example.user_answer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Options {
    private String optionId;
    private String text;
    private Boolean isCorrect;
}
