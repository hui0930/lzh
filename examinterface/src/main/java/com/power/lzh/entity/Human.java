package com.power.lzh.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 人员
 */
@Entity
@Data
@NoArgsConstructor
@Table(name="PB_Human")
public class Human {
    /**主键*/
    @Id
    private String id;

    /**人员编号*/
    private String code;

    /**人员名称*/
    private String name;

    /**部门id*/
    private String deptid;

    /**部门名称*/
    private String deptname;

    /**岗位id*/
    private String posiid;

    /**岗位名称*/
    private String posiname;

    /**更新时间*/
    private String upddate;

    /**手机号码*/
    private String mobile;

    /**单位*/
    private String unit;
    /**单位id*/
    private String unitid;

    /**管理类型 */
    private String wlcbWorktype;

    /**是否管理员*/
    private Boolean isadmin;

    /**工区*/
    private String jdShouquanjinru;

    /**工种*/
    private String wlcbBusinesstype;

    /**报验状态*/
    private String wlcbRcbyStatus;

    /**专业*/
    private String majorname;
}
