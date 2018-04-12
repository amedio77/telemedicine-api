package com.telemedicine.rest.telemedicine.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TelemedicineList {
    @Id
    private int seqNo;

    @Column(name = "from_id", updatable = false, insertable = false, nullable = false)
    private String fromId;

    private String toId;
    private String responseDt;
    private String reqeustDt;
    private String regDt;

    @ManyToOne(targetEntity=MemberInfo.class, fetch=FetchType.LAZY)
    @JoinColumn(name="from_id")
    private MemberInfo memberinfo;

}