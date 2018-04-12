package com.telemedicine.api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="lifelog_croise250_activity")
public class LifelogCroise250Activity {

    @Id
    private int     seqNo;

    private String  userId;
    private String  modeType;
    private String  msDt;
    private int     walkCnt;
    private float   moveDistance;
    private int     calorie;
    private int     actTime;
    private String  startTime;
    private String  endTime;
    private String  appVersion;
    private String  firmware;
    private String  regDt;

}
