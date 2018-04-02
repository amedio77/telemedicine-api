package com.telemedicine.rest.telemedicine.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TelemedicineList {
    @Id
    private int seqNo;

    private String fromId;
    private String toId;
    private String responseDt;
    private String reqeustDt;
    private String regDt;
}