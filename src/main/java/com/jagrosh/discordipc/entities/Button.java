package com.jagrosh.discordipc.entities;

import java.io.Serializable;

public class Button implements Serializable
{
    public static final Button DEFAULT = new Button("", "");

    public final String LABEL;
    public final String url;
    
    public Button(final String label, final String url) {
        if(label == null || url == null) throw new IllegalArgumentException("Button label and url cannot be null!");
        if(label.isEmpty() || url.isEmpty()) throw new IllegalArgumentException("Button label and url cannot be empty!");
        if(label.length() > 32) throw new IllegalArgumentException("Button label must be 32 characters or less!");
        if(url.length() > 512) throw new IllegalArgumentException("Button url must be 512 characters or less!");
        
        this.LABEL = label;
        this.url = url;
    }
    
    public Button(final Button other) {
        this(other.LABEL, other.url);
    }
    
    public Button copy() {
        return new Button(this);
    }
}