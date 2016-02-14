package com.demisstif.recyclerviewpractice;

import java.util.List;

/**
 * Created by demisstif on 2016/2/14.
 */
public class MyData {
    private int messageFrom;
    private String messageContent;


    /**
     * constructer if dont hava the messageFrom that it will be 0
     * @param messageContent
     */
    public MyData(String messageContent) {
        this(Config.MESSAGE_FORM_USER,messageContent);
    }
    public MyData(int messageFrom, String messageContent) {
        this.messageFrom = messageFrom;
        this.messageContent = messageContent;
    }

    public void setMessageFrom(int messageFrom) {
        this.messageFrom = messageFrom;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public int getMessageFrom() {

        return messageFrom;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
