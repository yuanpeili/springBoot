package model.input;

import lombok.Data;

/**
 * @author m1760
 */
@Data
public class UserQuery extends AbstractQuery {

    private static final long serialVersionUID = -3710816201523477987L;
    private String name;

    private Integer age;

    private Byte sex;

    private String phone;

    private String password;

    private String weChatNum;

    private Integer qqNum;

    private Integer high;

    private Integer wight;

    private String img;

    private String idCard;

    private String address;

    private String emergencyContact;

    private String emergencyContactPhone;
}