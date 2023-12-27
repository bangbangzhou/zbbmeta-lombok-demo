package com.zbbmeta.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName user
 */

@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private Integer age;

    private String sName;


    private static final long serialVersionUID = 1L;
}