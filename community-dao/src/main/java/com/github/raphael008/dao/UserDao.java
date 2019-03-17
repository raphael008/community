package com.github.raphael008.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "bd_user")
public class UserDao extends BaseDao {
    @Id
    private Long userId;

    private String userName;

    private Date createTime;

    private boolean deleted;
}