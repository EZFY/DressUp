package com.ynu.makeup_you.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Created on 2019/5/16 0016
 * BY hujianlong
 */
@Entity
@Table(name="comments")
@IdClass(CommDoubleKey.class)
public class Comments {
    private Integer userID;
    private Integer postID;
    private String time;
    private String messages;

    @Id
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    @Id
    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    /**
     * 重写toString方法
     */

    @Override
    public String toString() {
        return "comments{" +
                "userID=" + userID +
                ", postID=" + postID +
                ", time='" + time + '\'' +
                ", message='" + messages + '\'' +
                '}';
    }
}
