package com.telemedicine.api.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class LifelogCroiseSleep {

    @Id
    private int     seqNo;

    private String  userId;
    private String  msDt;
    private int     totTime;
    private int     deepTime;
    private int     lightTime;
    private int     recIndex;
    private int     sleepIndex;
    private int     condIndex;
    private String  appVersion;
    private String  firmware;
    private String  regDt;

}
