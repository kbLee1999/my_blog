package com.muscle.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户信息实体类
 * author: LJW
 */
@Data
@Builder
@TableName("t_user_info")
public class UserInfo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String email;
    private String nickname;
    private String avatar;
    private String intro;
    private String webSite;
    private Boolean isSubscribe;
    private Boolean isDisable;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}
