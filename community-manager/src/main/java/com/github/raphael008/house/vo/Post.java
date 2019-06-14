package com.github.raphael008.house.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post {
    private String postTitle;
    private String postUrl;
    private String author;
    private String authorUrl;
    private int replies;
    private Date lastReplyDate;
}
