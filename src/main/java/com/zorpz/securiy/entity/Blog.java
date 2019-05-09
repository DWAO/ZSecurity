package com.zorpz.securiy.entity;

import lombok.Data;

/**
 * @author Punk
 * @date 2019/05/08
 */
@Data
public class Blog {

    private Long id;
    private String name;
    private String content;

    public Blog() {
    }

    public Blog(Long id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }
}
