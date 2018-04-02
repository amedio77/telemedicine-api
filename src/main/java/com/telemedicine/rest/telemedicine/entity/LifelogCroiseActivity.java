package com.telemedicine.rest.telemedicine.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class LifelogCroiseActivity {

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
