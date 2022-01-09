package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {
    private long id;
    @NotEmpty(message = "name should not be null or empty")
    private String name;
    @NotEmpty(message = "email should not be null or empty")
    @Email(message = "should be a valid email")
    private String email;
    @NotEmpty
    @Size(min = 10, message = "body should be at least 10 chars")
    private String body;
}
