package com.example.Module_Service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContentDto {
    private String contentId;
    private String moduleId;
    private String ContentTitle;
    private String contentType;
    private String contentUrl;
    private  boolean isCompleted;
}
