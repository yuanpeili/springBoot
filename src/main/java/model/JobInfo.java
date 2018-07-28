package model;

import lombok.Data;

import java.util.Date;
/**
 * @author m1760
 */
@Data
public class JobInfo extends AbstractPO {

    private static final long serialVersionUID = -3779484820517455613L;
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