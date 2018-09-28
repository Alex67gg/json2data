package com.json.cn.json2data.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Alex5467
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserParam {
        /**
         * 用户ID
         */
        private Long userId;

        /**
         * 用户名
         */
        private String name;

        /**
         * 账号
         */
        private String account;

        /**
         * 密码
         */
        private String password;

        /**
         * 盐
         */
        private String salt;

        /**
         * 用户类型（0：运营，1：代理商）
         */
        private Integer userType;

        /**
         * 手机号
         */
        private String mobile;

        /**
         * 电子邮件地址
         */
        private String email;

        /**
         * 状态（0：禁用，1：可用）
         */
        private Integer userStatus;

        /**
         * 创建人
         */
        private Long createBy;

        /**
         * 创建人姓名
         */
        private String creator;

        /**
         * 上次登录时间
         */
        private Date lastLoginTime;

        /**
         * 是否删除（0: 否，1：是）
         */
        private Integer isDelete;
        /**
         * 创建时间
         */
        private Date createTime;
}
