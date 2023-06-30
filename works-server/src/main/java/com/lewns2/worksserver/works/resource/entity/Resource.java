package com.lewns2.worksserver.works.resource.entity;

import com.lewns2.worksserver.base.base_entity.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity(name = "resource")
@Table(name = "resources")
public class Resource{

    @Id
    @Column(name = "res_cd")
    private String res_cd;

    @Column(name = "res_nm")
    private String res_nm;

    @Column(name = "res_detail")
    private String res_detail;

    @Column(name = "usg_yn")
    private String usg_yn;

    @Column(name = "comments")
    private String comments;

    @Column(name = "comn_ofb")
    private String comn_ofb;

    @Column(name = "comn_loc")
    private String comn_loc;

    @Column(name = "comn_rst")
    private String comn_rst;

    @Column(name = "res_opt1")
    private String res_opt1;

    @Column(name = "res_opt2")
    private String res_opt2;

    @Column(name = "res_opt3")
    private String res_opt3;

    @Column(name = "res_opt4")
    private String res_opt4;

    @Column(name = "res_opt5")
    private String res_opt5;

    @Builder
    public Resource(String res_cd, String res_nm, String res_detail, String usg_yn, String comments, String comn_ofb, String comn_loc, String comn_rst, String res_opt1, String res_opt2, String res_opt3, String res_opt4, String res_opt5) {
        this.res_cd = res_cd;
        this.res_nm = res_nm;
        this.res_detail = res_detail;
        this.usg_yn = usg_yn;
        this.comments = comments;
        this.comn_ofb = comn_ofb;
        this.comn_loc = comn_loc;
        this.comn_rst = comn_rst;
        this.res_opt1 = res_opt1;
        this.res_opt2 = res_opt2;
        this.res_opt3 = res_opt3;
        this.res_opt4 = res_opt4;
        this.res_opt5 = res_opt5;
    }
}
