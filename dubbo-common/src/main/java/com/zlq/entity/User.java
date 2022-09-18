package com.zlq.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 是否删除
     */
    private Integer deleted;
}
