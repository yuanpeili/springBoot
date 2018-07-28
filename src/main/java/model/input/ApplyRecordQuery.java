package model.input;

import lombok.Data;

/**
 * @author m1760
 */
@Data
public class ApplyRecordQuery extends AbstractQuery {

    private static final long serialVersionUID = -7585478478626141885L;
    private Integer userId;

    private Integer jobInfoId;

    private Byte status;

}