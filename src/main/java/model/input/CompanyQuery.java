package model.input;

import lombok.Data;

/**
 * @author m1760
 */
@Data
public class CompanyQuery extends AbstractQuery{

    private static final long serialVersionUID = 2523314154662031172L;
    private Integer businessId;

    private String companyName;

    private String phone;

    private String address;

    private Integer region;

    private String introduce;

    private String img;

    private Byte authenticationFlag;


}