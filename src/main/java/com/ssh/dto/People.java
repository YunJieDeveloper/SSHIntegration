package com.ssh.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class People {
    private int id;
    private int age;
    private String name;
    private String note;
}
