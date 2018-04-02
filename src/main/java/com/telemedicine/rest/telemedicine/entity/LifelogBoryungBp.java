package com.telemedicine.rest.telemedicine.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class LifelogBoryungBp {

    @Id
    private int     seqNo ;

    private String  userId;
    private String  modeType;
    private String  msDt;
    private int     systolic;
    private int     diastolic;
    private int     pulse;
    private String  appVersion;
    private String  firmware;
    private String  regDt;
}
