package com.xiaohei.model;

import java.util.Date;

public class Hy {
    private Long id;

    private String name;

    private Date sTime;

    private Date eTime;

    private String theme;

    private String pirture1;

    private String pirture2;

    private String status;

    private String address;

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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getPirture1() {
        return pirture1;
    }

    public void setPirture1(String pirture1) {
        this.pirture1 = pirture1 == null ? null : pirture1.trim();
    }

    public String getPirture2() {
        return pirture2;
    }

    public void setPirture2(String pirture2) {
        this.pirture2 = pirture2 == null ? null : pirture2.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
            && (this.geteTime() == null ? other.geteTime() == null : this.geteTime().equals(other.geteTime()))
            && (this.getTheme() == null ? other.getTheme() == null : this.getTheme().equals(other.getTheme()))
            && (this.getPirture1() == null ? other.getPirture1() == null : this.getPirture1().equals(other.getPirture1()))
            && (this.getPirture2() == null ? other.getPirture2() == null : this.getPirture2().equals(other.getPirture2()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getsTime() == null) ? 0 : getsTime().hashCode());
        result = prime * result + ((geteTime() == null) ? 0 : geteTime().hashCode());
        result = prime * result + ((getTheme() == null) ? 0 : getTheme().hashCode());
        result = prime * result + ((getPirture1() == null) ? 0 : getPirture1().hashCode());
        result = prime * result + ((getPirture2() == null) ? 0 : getPirture2().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return result;
    }
}