package model.input;

import lombok.Data;

/**
 * @author m1760
 */
@Data
public class JobQuery extends AbstractQuery{

    private static final long serialVersionUID = 343546966609527954L;
    private Integer companyId;

    private String name;

    private String require;

}