package com.telemedicine.rest.telemedicine.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CodeHosp {

    @Id
    private String codeId;
    private String constraint;
}
