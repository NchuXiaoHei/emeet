package com.xiaohei.model;

public class Tp {   //投票
    private Long id;

    private Long userId;

    private Integer tpId;

    private Boolean px;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public Boolean getPx() {
        return px;
    }

    public void setPx(Boolean px) {
        this.px = px;
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
        Tp other = (Tp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTpId() == null ? other.getTpId() == null : this.getTpId().equals(other.getTpId()))
            && (this.getPx() == null ? other.getPx() == null : this.getPx().equals(other.getPx()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTpId() == null) ? 0 : getTpId().hashCode());
        result = prime * result + ((getPx() == null) ? 0 : getPx().hashCode());
        return result;
    }
}