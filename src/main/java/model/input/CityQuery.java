package model.input;

import lombok.Data;

/**
 * @author m1760
 */
@Data
public class CityQuery extends AbstractQuery {

    private static final long serialVersionUID = -2886631123519898239L;
    private Integer regionId;

    private String name;

    private Integer pid;

    private Integer levelId;

    private String pids;


}