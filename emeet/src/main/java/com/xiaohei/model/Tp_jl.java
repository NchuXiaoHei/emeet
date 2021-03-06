package com.xiaohei.model;

public class Tp_jl {
    private Integer tpId;

    private Long userId;

    private Integer px;

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPx() {
        return px;
    }

    public void setPx(Integer px) {
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
        Tp_jl other = (Tp_jl) that;
        return (this.getTpId() == null ? other.getTpId() == null : this.getTpId().equals(other.getTpId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPx() == null ? other.getPx() == null : this.getPx().equals(other.getPx()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTpId() == null) ? 0 : getTpId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPx() == null) ? 0 : getPx().hashCode());
        return result;
    }
}