package com.xiaohei.model;

import java.util.Date;

public class Hy {   //会议
    private Long id;

    private String name;

    private Date sTime;

    private Date eTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        Hy other = (Hy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getsTime() == null ? other.getsTime() == null : this.getsTime().equals(other.getsTime()))
            && (this.geteTime() == null ? other.geteTime() == null : this.geteTime().equals(other.geteTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getsTime() == null) ? 0 : getsTime().hashCode());
        result = prime * result + ((geteTime() == null) ? 0 : geteTime().hashCode());
        return result;
    }
}