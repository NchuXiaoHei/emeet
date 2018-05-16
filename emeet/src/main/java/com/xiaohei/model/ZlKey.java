package com.xiaohei.model;

public class ZlKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zl.zl_id
     *
     * @mbg.generated
     */
    private Integer zlId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zl.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zl.zl_id
     *
     * @return the value of zl.zl_id
     *
     * @mbg.generated
     */
    public Integer getZlId() {
        return zlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zl.zl_id
     *
     * @param zlId the value for zl.zl_id
     *
     * @mbg.generated
     */
    public void setZlId(Integer zlId) {
        this.zlId = zlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zl.ID
     *
     * @return the value of zl.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zl.ID
     *
     * @param id the value for zl.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
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
        ZlKey other = (ZlKey) that;
        return (this.getZlId() == null ? other.getZlId() == null : this.getZlId().equals(other.getZlId()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getZlId() == null) ? 0 : getZlId().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
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
        ZlKey other = (ZlKey) that;
        return (this.getZlId() == null ? other.getZlId() == null : this.getZlId().equals(other.getZlId()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getZlId() == null) ? 0 : getZlId().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}