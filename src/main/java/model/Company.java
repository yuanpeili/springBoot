package model;

import lombok.Data;
/**
 * @author m1760
 */
@Data
public class Company extends AbstractPO{

    private static final long serialVersionUID = 402452493959753662L;
    private Integer businessId;

    private String companyName;

    private String phone;

    private String address;

    private Integer region;

    private String introduce;

    private String img;

    private Byte authenticationFlag;


}