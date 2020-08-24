package com.jhl.admin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Stat extends BaseEntity implements Serializable {

    private Integer accountId;
    //结算周期
    private Date fromDate;

    private Date toDate;
    //流量 最大值 2^64 ,1T 等于 2^40
    private Long flow;
}

