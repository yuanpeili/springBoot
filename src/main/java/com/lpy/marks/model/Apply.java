package com.lpy.marks.model;

import lombok.Data;

/**
 * @author sandu-lipeiyuan
 */
@Data
public class Apply extends AbstractPO {

    private static final long serialVersionUID = 8563654983985899344L;

    private Integer id;

    private Integer userId;

    private Integer jobInfoId;


}
