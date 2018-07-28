package model.input;

import lombok.Data;

import java.util.Date;

/**
 * @author m1760
 */
@Data
public class JobInfoQuery extends AbstractQuery {

    private static final long serialVersionUID = -6994075182482468322L;
    private Integer companyId;

    private String companyName;

    private Integer jobId;

    private String jobName;

    private String jobAddr;

    private String require;

    private Integer jobNum;

    private Date startTime;

    private Date endTime;


}