package web.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_login_log")
public class UserLoginLog implements java.io.Serializable {
    
    private static final long serialVersionUID = 8686390190132322570L;
    
    private Integer loginId;
    private String ip;
    private String address;
    private Integer type;
    private Integer status;

    //private UserBaseInfo userBaseInfo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "login_id", unique = true, nullable = false)
    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    @Column(name = "ip", nullable = true)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "address", nullable = true)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "type", nullable = false)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Column(name = "status", nullable = false)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
