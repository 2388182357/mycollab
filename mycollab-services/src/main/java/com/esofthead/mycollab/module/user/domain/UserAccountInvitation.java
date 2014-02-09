/*Domain class of table s_user_account_invitation*/
package com.esofthead.mycollab.module.user.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@com.esofthead.mycollab.core.db.metadata.Table("s_user_account_invitation")
public class UserAccountInvitation extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_account_invitation.id
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_account_invitation.username
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("username")
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_account_invitation.accountId
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("accountId")
    private Integer accountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_account_invitation.invitationStatus
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("invitationStatus")
    private String invitationstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_account_invitation.sentDate
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sentDate")
    private Date sentdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_account_invitation.createdTime
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_account_invitation.inviteUser
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("inviteUser")
    private String inviteuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_account_invitation.id
     *
     * @return the value of s_user_account_invitation.id
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_account_invitation.id
     *
     * @param id the value for s_user_account_invitation.id
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_account_invitation.username
     *
     * @return the value of s_user_account_invitation.username
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_account_invitation.username
     *
     * @param username the value for s_user_account_invitation.username
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_account_invitation.accountId
     *
     * @return the value of s_user_account_invitation.accountId
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public Integer getAccountid() {
        return accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_account_invitation.accountId
     *
     * @param accountid the value for s_user_account_invitation.accountId
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_account_invitation.invitationStatus
     *
     * @return the value of s_user_account_invitation.invitationStatus
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public String getInvitationstatus() {
        return invitationstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_account_invitation.invitationStatus
     *
     * @param invitationstatus the value for s_user_account_invitation.invitationStatus
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public void setInvitationstatus(String invitationstatus) {
        this.invitationstatus = invitationstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_account_invitation.sentDate
     *
     * @return the value of s_user_account_invitation.sentDate
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public Date getSentdate() {
        return sentdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_account_invitation.sentDate
     *
     * @param sentdate the value for s_user_account_invitation.sentDate
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public void setSentdate(Date sentdate) {
        this.sentdate = sentdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_account_invitation.createdTime
     *
     * @return the value of s_user_account_invitation.createdTime
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_account_invitation.createdTime
     *
     * @param createdtime the value for s_user_account_invitation.createdTime
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_account_invitation.inviteUser
     *
     * @return the value of s_user_account_invitation.inviteUser
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public String getInviteuser() {
        return inviteuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_account_invitation.inviteUser
     *
     * @param inviteuser the value for s_user_account_invitation.inviteUser
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    public void setInviteuser(String inviteuser) {
        this.inviteuser = inviteuser;
    }
}