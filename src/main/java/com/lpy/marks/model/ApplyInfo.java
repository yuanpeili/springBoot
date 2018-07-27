package com.lpy.marks.model;

import lombok.Data;

/**
 * @author sandu-lipeiyuan
 */
@Data
public class ApplyInfo extends AbstractPO {

    private static final long serialVersionUID = 5729314768811118915L;

    private Integer id;

    private Integer userId;

    private Integer jobInfoId;


}