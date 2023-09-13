package proSettingsShareService.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
@TableName("sys_admin")
public class SysAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号名
     */
    private String accountName;

    /**
     * 账号id
     */
    private Integer accountId;

    /**
     * 账号密码
     */
    private String accountPassword;

    /**
     * 账号角色(管理员：ADMIN)
     */
    private String accountRole;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(String accountRole) {
        this.accountRole = accountRole;
    }

    @Override
    public String toString() {
        return "SysAdmin{" +
        "accountName = " + accountName +
        ", accountId = " + accountId +
        ", accountPassword = " + accountPassword +
        ", accountRole = " + accountRole +
        "}";
    }
}
