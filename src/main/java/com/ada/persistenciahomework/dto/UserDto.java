package com.ada.persistenciahomework.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class UserDto {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

}