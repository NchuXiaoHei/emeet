package com.xiaohei.model;

public class Zl {
    private Integer zlId;

    private Long id;

    private String filePath;

    public Integer getZlId() {
        return zlId;
    }

    public void setZlId(Integer zlId) {
        this.zlId = zlId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
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
        Zl other = (Zl) that;
        return (this.getZlId() == null ? other.getZlId() == null : this.getZlId().equals(other.getZlId()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getZlId() == null) ? 0 : getZlId().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        return result;
    }
}