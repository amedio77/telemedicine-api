package com.telemedicine.rest.telemedicine.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class LifelogRibbonBs {

    @Id
    public int      seqNo;

    public String   userId;
    public String   msDt;
    public int      bsValue;
    public String   msDiv;
    public String   msTime;
    public String   modeType;
    public String   appVersion;
    public String   firmware;
    public String   regDt;

}
