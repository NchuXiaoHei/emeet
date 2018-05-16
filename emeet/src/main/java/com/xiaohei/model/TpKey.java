package com.xiaohei.model;

public class TpKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp.tp_id
     *
     * @mbg.generated
     */
    private Integer tpId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp.ID
     *
     * @return the value of tp.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp.ID
     *
     * @param id the value for tp.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp.user_id
     *
     * @return the value of tp.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp.user_id
     *
     * @param userId the value for tp.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp.tp_id
     *
     * @return the value of tp.tp_id
     *
     * @mbg.generated
     */
    public Integer getTpId() {
        return tpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp.tp_id
     *
     * @param tpId the value for tp.tp_id
     *
     * @mbg.generated
     */
    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp
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
        TpKey other = (TpKey) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTpId() == null ? other.getTpId() == null : this.getTpId().equals(other.getTpId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTpId() == null) ? 0 : getTpId().hashCode());
        return result;
    }

}