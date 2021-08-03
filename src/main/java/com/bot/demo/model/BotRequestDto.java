package com.bot.demo.model;

import java.util.Map;

public class BotRequestDto {

    private int userId = 1;
    private int currOptionId; // mandatory
    private String freeText; // for text classification
    private int optionId;
    private int suggestedOptionId;
    private Map<String,String> paramMap; // clean - contextual

    public int getCurrOptionId() {
        return currOptionId;
    }

    public void setCurrOptionId(int currOptionId) {
        this.currOptionId = currOptionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }
}
