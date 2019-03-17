package com.github.raphael008.dao;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseDao {
    private Date createTime;
    private boolean deleted;
}
