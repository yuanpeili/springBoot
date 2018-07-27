package com.lpy.marks.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author sandu-lipeiyuan
 */
@Data
public class AbstractPO implements Serializable {

    private static final long serialVersionUID = -9012932082018604335L;
    private String version;

    private LocalDateTime createdTime;

    private Integer createdBy;

    private LocalDateTime updateTime;

    private Integer updateBy;

    private Integer delFlag;
}
