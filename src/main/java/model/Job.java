package model;

import lombok.Data;
/**
 * @author m1760
 */
@Data
public class Job extends AbstractPO{

    private static final long serialVersionUID = 8082164277333374740L;
    private Integer companyId;

    private String name;

    private String require;


}