package com.tastetracker.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto
{
    private Long id;
    private String login;
}
