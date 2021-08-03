package com.bot.demo.model;

import com.bot.demo.enums.DataType;
import com.bot.demo.enums.NodeHttpMethod;
import com.bot.demo.enums.NodeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BotNodeDto {

    // TODO each step will have start over option

    private int id;
    private NodeType type;
    private String label; // what to display
    private List<BotNodeDto> options = new ArrayList<>();
    private String target; // apiUrl / linkUrl
    private NodeHttpMethod method;
    private DataType dataType; // link / option / text

    private String requiredParams; // only for api
    private List<Integer> childNode;

    public BotNodeDto(int id, NodeType type, String label, List<Integer> childNode,String requiredParams) {
        this.id = id;
        this.type = type;
        this.label = label;
        this.childNode = childNode;
        this.requiredParams = requiredParams;
    }

    public String getRequiredParams() {
        return requiredParams;
    }

    public void setRequiredParams(String requiredParams) {
        this.requiredParams = requiredParams;
    }



    public List<Integer> getChildNode() {
        return childNode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodeType getType() {
        return type;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<BotNodeDto> getOptions() {
        return options;
    }

    public void setOptions(List<BotNodeDto> options) {
        this.options = options;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public NodeHttpMethod getMethod() {
        return method;
    }

    public void setMethod(NodeHttpMethod method) {
        this.method = method;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public void addChildNode(Integer i){
        childNode.add(i);
    }
}


