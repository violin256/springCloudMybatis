package jzc.cn;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: LiangYF
 * @Date: 2018/5/30 15:55
 */
public class OtInfo implements Serializable {
    private Integer id;
    private String serialNumber;
    private Integer clientType;
    private Integer applyUserId;
    private String applyUserName;
    private Integer applyDeptId;
    private String applyDeptName;
    private String title;
    private Date startTime;
    private Date endTime;
    private Float otTimeCount;
    private String otReason;
    private Integer auditResult;
    private Integer schoolId;
    private Date createTime;
    private Date modifyTime;

    @Override
    public String toString() {
        return "OtInfo{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", clientType=" + clientType +
                ", applyUserId=" + applyUserId +
                ", applyUserName='" + applyUserName + '\'' +
                ", applyDeptId=" + applyDeptId +
                ", applyDeptName='" + applyDeptName + '\'' +
                ", title='" + title + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", otTimeCount=" + otTimeCount +
                ", otReason='" + otReason + '\'' +
                ", auditResult=" + auditResult +
                ", schoolId=" + schoolId +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(Integer auditResult) {
        this.auditResult = auditResult;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Float getOtTimeCount() {
        return otTimeCount;
    }

    public void setOtTimeCount(Float otTimeCount) {
        this.otTimeCount = otTimeCount;
    }

    public String getOtReason() {
        return otReason;
    }

    public void setOtReason(String otReason) {
        this.otReason = otReason;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    public Integer getApplyDeptId() {
        return applyDeptId;
    }

    public void setApplyDeptId(Integer applyDeptId) {
        this.applyDeptId = applyDeptId;
    }

    public String getApplyDeptName() {
        return applyDeptName;
    }

    public void setApplyDeptName(String applyDeptName) {
        this.applyDeptName = applyDeptName;
    }
}
