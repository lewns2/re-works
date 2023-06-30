package com.lewns2.worksserver.base.base_entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@Getter @Setter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Id
    private Long id;

    @Column
    private String reg_usr_id;

    @Column
    private String reg_ip;

    @Column
    private String reg_dt;

    protected BaseEntity(String reg_usr_id, String reg_ip, String reg_dt) {
        this.reg_usr_id = reg_usr_id;
        this.reg_ip = reg_ip;
        this.reg_dt = reg_dt;
    }
}
