package com.xiaohei.model;

import java.util.Date;

public class Lc extends LcKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lc.s_time
     *
     * @mbg.generated
     */
    private Date sTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lc.e_time
     *
     * @mbg.generated
     */
    private Date eTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lc.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lc.s_time
     *
     * @return the value of lc.s_time
     *
     * @mbg.generated
     */
    public Date getsTime() {
        return sTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lc.s_time
     *
     * @param sTime the value for lc.s_time
     *
     * @mbg.generated
     */
    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lc.e_time
     *
     * @return the value of lc.e_time
     *
     * @mbg.generated
     */
    public Date geteTime() {
        return eTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lc.e_time
     *
     * @param eTime the value for lc.e_time
     *
     * @mbg.generated
     */
    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lc.note
     *
     * @return the value of lc.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lc.note
     *
     * @param note the value for lc.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lc
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
        Lc other = (Lc) that;
        return (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getsTime() == null ? other.getsTime() == null : this.getsTime().equals(other.getsTime()))
            && (this.geteTime() == null ? other.geteTime() == null : this.geteTime().equals(other.geteTime()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lc
     *
     * @mbg.generated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lc
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
        Lc other = (Lc) that;
        return (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getsTime() == null ? other.getsTime() == null : this.getsTime().equals(other.getsTime()))
            && (this.geteTime() == null ? other.geteTime() == null : this.geteTime().equals(other.geteTime()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lc
     *
     * @mbg.generated
     */
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