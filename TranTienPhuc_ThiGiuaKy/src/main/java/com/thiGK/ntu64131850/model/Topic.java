package com.thiGK.ntu64131850.model;

public class Topic {
    private String id;
    private String topicName;
    private String topicDescription;
    private String supervisorId;
    private String typicType;

    public Topic(String id, String topicName, String topicDescription, String supervisorId, String typicType) {
        this.id = id;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.supervisorId = supervisorId;
        this.typicType = typicType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getTypicType() {
        return typicType;
    }

    public void setTypicType(String typicType) {
        this.typicType = typicType;
    }
}
