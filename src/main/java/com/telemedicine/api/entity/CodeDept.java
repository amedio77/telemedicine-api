package com.telemedicine.api.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CodeDept {

    @Id
    private String codeId;

    private String hospId;
    private String constraint;
}
