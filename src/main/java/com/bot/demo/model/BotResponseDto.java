package com.bot.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BotResponseDto {

    private String descriptionText;
    private List<BotNodeDto> options  = new ArrayList<>();
    private String errorMsg;
    private Map<String, String> contextMap; // sanitized user-inputs

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public List<BotNodeDto> getOptions() {
        return options;
    }

    public void setOptions(List<BotNodeDto> options) {
        this.options = options;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
