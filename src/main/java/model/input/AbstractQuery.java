package model.input;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author sandu-lipeiyuan
 */
@Data
public class AbstractQuery implements Serializable {

    private static final long serialVersionUID = -9012932082018604335L;

    private Set<Integer> ids;

    private Integer id;

    private String remark;

    private String version;

    private LocalDateTime createdTime;

    private Integer createdBy;

    private LocalDateTime updateTime;

    private Integer updateBy;

    private Integer delFlag;
}
