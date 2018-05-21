package com.xiaohei.model;

import java.util.Date;

public class Lc {   //会议流程
    private Integer num;

    private Long id;

    private Date sTime;

    private Date eTime;

    private String note;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getsTime() {
        return sTime;
    }

    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Lc other = (Lc) that;
        return (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getsTime() == null ? other.getsTime() == null : this.getsTime().equals(other.getsTime()))
            && (this.geteTime() == null ? other.geteTime() == null : this.geteTime().equals(other.geteTime()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getsTime() == null) ? 0 : getsTime().hashCode());
        result = prime * result + ((geteTime() == null) ? 0 : geteTime().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}