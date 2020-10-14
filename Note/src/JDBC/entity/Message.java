package JDBC.entity;

/**
 *      实体类：和数据库表一至。
 *              message表 == Message类
 */
public class Message {
    //成员变量 == 列
    private int empId;
    private String empAccount;
    private String empPassword;
    private String empName;
    private int empType;

    @Override
    public String toString() {
        return "信息 [" +
                "empId=" + empId +
                ", empAccount='" + empAccount + '\'' +
                ", empPassword='" + empPassword + '\'' +
                ", empName='" + empName + '\'' +
                ", empType=" + empType +
                ']';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpAccount() {
        return empAccount;
    }

    public void setEmpAccount(String empAccount) {
        this.empAccount = empAccount;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpType() {
        return empType;
    }

    public void setEmpType(int empType) {
        this.empType = empType;
    }
}
