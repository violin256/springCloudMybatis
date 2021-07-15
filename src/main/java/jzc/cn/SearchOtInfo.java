package jzc.cn;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: LiangYF
 * @Date: 2018/5/30 17:05
 */
public class SearchOtInfo implements Serializable {
    private Integer schoolId;
    private Date startTime;
    private Date endTime;
    private Integer auditResult;
    private String serialNumber;
    private Integer applyUserId;
    private Integer applyDeptId;
    private String applyUserName;
    private Date startTimeScreening;
    private Date endTimeScreening;

    public Date getStartTimeScreening() {
        return startTimeScreening;
    }

    public void setStartTimeScreening(Date startTimeScreening) {
        this.startTimeScreening = startTimeScreening;
    }

    public Date getEndTimeScreening() {
        return endTimeScreening;
    }

    public void setEndTimeScreening(Date endTimeScreening) {
        this.endTimeScreening = endTimeScreening;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(Integer auditResult) {
        this.auditResult = auditResult;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getApplyDeptId() {
        return applyDeptId;
    }

    public void setApplyDeptId(Integer applyDeptId) {
        this.applyDeptId = applyDeptId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }
}
