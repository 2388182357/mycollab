/*Domain class of table m_form_section_field*/
package com.esofthead.mycollab.form.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;

@com.esofthead.mycollab.core.db.metadata.Table("m_form_section_field")
public class FormSectionField extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.id
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.sectionId
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sectionId")
    private Integer sectionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.isMandatory
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("isMandatory")
    private Boolean ismandatory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.fieldIndex
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("fieldIndex")
    private Integer fieldindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.displayName
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=100, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("displayName")
    private String displayname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.fieldFormat
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=200, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("fieldFormat")
    private String fieldformat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.fieldname
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("fieldname")
    private String fieldname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.fieldType
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=1000, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("fieldType")
    private String fieldtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.isRequired
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("isRequired")
    private Boolean isrequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section_field.isCustom
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("isCustom")
    private Boolean iscustom;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.id
     *
     * @return the value of m_form_section_field.id
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.id
     *
     * @param id the value for m_form_section_field.id
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.sectionId
     *
     * @return the value of m_form_section_field.sectionId
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public Integer getSectionid() {
        return sectionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.sectionId
     *
     * @param sectionid the value for m_form_section_field.sectionId
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.isMandatory
     *
     * @return the value of m_form_section_field.isMandatory
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public Boolean getIsmandatory() {
        return ismandatory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.isMandatory
     *
     * @param ismandatory the value for m_form_section_field.isMandatory
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setIsmandatory(Boolean ismandatory) {
        this.ismandatory = ismandatory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.fieldIndex
     *
     * @return the value of m_form_section_field.fieldIndex
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public Integer getFieldindex() {
        return fieldindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.fieldIndex
     *
     * @param fieldindex the value for m_form_section_field.fieldIndex
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setFieldindex(Integer fieldindex) {
        this.fieldindex = fieldindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.displayName
     *
     * @return the value of m_form_section_field.displayName
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.displayName
     *
     * @param displayname the value for m_form_section_field.displayName
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.fieldFormat
     *
     * @return the value of m_form_section_field.fieldFormat
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public String getFieldformat() {
        return fieldformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.fieldFormat
     *
     * @param fieldformat the value for m_form_section_field.fieldFormat
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setFieldformat(String fieldformat) {
        this.fieldformat = fieldformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.fieldname
     *
     * @return the value of m_form_section_field.fieldname
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public String getFieldname() {
        return fieldname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.fieldname
     *
     * @param fieldname the value for m_form_section_field.fieldname
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.fieldType
     *
     * @return the value of m_form_section_field.fieldType
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public String getFieldtype() {
        return fieldtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.fieldType
     *
     * @param fieldtype the value for m_form_section_field.fieldType
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setFieldtype(String fieldtype) {
        this.fieldtype = fieldtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.isRequired
     *
     * @return the value of m_form_section_field.isRequired
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public Boolean getIsrequired() {
        return isrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.isRequired
     *
     * @param isrequired the value for m_form_section_field.isRequired
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setIsrequired(Boolean isrequired) {
        this.isrequired = isrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section_field.isCustom
     *
     * @return the value of m_form_section_field.isCustom
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public Boolean getIscustom() {
        return iscustom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section_field.isCustom
     *
     * @param iscustom the value for m_form_section_field.isCustom
     *
     * @mbggenerated Sun Feb 09 16:15:23 ICT 2014
     */
    public void setIscustom(Boolean iscustom) {
        this.iscustom = iscustom;
    }
}