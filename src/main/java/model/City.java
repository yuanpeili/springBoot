package model;

import lombok.Data;

/**
 * @author m1760
 */
@Data
public class City extends AbstractPO {

    private static final long serialVersionUID = 4772398339655906652L;
    private Integer regionId;

    private String name;

    private Integer pid;

    private Integer levelId;

    private String pids;


}