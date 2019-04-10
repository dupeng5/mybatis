package com.example.mybatis.view.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author dupeng
 * @since 2019-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ARCHITECTURE_STATIC_DATA")
public class ArchitectureStaticData extends Model<ArchitectureStaticData> {

    private static final long serialVersionUID = 1L;

    @TableId("DATA_ID")
    private Long dataId;
    @TableField("CODE_TYPE")
    private String codeType;
    @TableField("CODE_VALUE")
    private String codeValue;
    @TableField("CODE_NAME")
    private String codeName;
    @TableField("CODE_DESC")
    private String codeDesc;
    @TableField("EXT1")
    private String ext1;
    @TableField("EXT2")
    private String ext2;
    @TableField("EXT3")
    private String ext3;


    @Override
    protected Serializable pkVal() {
        return this.dataId;
    }

}
