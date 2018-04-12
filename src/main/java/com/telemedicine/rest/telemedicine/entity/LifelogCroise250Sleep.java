package com.telemedicine.rest.telemedicine.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="lifelog_croise250_sleep")
public class LifelogCroise250Sleep {

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
