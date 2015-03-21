package com.k.qing.jenkins.plugin.buildline.bean;

import hudson.model.AbstractBuild;

/**
 * Created by jqmint on 3/20/15.
 */
public class CellBean {

    private int duration;
    private int buildNumber;
    private String content;
    private AbstractBuild<?, ?> build;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AbstractBuild<?, ?> getBuild() {
        return build;
    }

    public void setBuild(AbstractBuild<?, ?> build) {
        this.build = build;
    }
}
