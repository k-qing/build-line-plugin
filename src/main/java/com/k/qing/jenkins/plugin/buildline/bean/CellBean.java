package com.k.qing.jenkins.plugin.buildline.bean;

import hudson.model.AbstractBuild;
import hudson.model.Result;

/**
 * Created by jqmint on 3/20/15.
 */
public class CellBean {

    private int duration;
    private int buildNumber;
    private String content;
    private AbstractBuild<?, ?> build;
    private String color = "#00ccff";

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

    public String getColor() {
        if (this.build.isBuilding()) {
            return "#f7f94b";
        } else if (this.build.getResult() == Result.SUCCESS) {
            return "#1bd130";
        } else if (this.build.getResult() == Result.FAILURE) {
            return "#ef2929";
        } else if (this.build.getResult() == Result.ABORTED) {
            return "#bab4b4";
        } else {
            return color;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
}
