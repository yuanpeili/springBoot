package model;

import lombok.Data;

@Data
public class ApplyRecord extends AbstractPO {

    private static final long serialVersionUID = 4855873069665497756L;
    private Integer userId;

    private Integer jobInfoId;

    private Byte status;

}