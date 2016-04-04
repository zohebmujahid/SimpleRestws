package com.zoheb.restws;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by zoheb on 4/4/16.
 */

@XmlRootElement
public class Summary {
    private String summary;
    private String description;


    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
