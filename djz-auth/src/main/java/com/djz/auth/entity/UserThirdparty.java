package com.djz.auth.entity;



import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 第三方用户表
 * </p>
 *
 * @author djz
 * @since 2018-07-27
 */
@Builder
@Data
@TableName("tb_user_thirdparty")
public class UserThirdparty extends Model<UserThirdparty> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "user_thirdparty_id", type = IdType.AUTO)
    private Integer userThirdpartyId;
    /**
     * 第三方Id
     */
    @TableField("open_id")
    private String openId;
    /**
     * 绑定用户的id
     */
    @TableField("user_no")
    private String userNo;
    /**
     * 第三方token
     */
    @TableField("access_token")
    private String accessToken;
    /**
     * 第三方类型 qq:QQ 微信:WX 微博:SINA
     */
    @TableField("provider_type")
    private String providerType;
    /**
     * 状态值（1：启用，2：禁用，3：删除）
     */
    private Integer status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;

    @Override
    protected Serializable pkVal() {
        return this.userThirdpartyId;
    }

}
