package com.androidmonk.journal;

public class Note {
    private String title;
    private String description;
    private long priority;

    public Note(){
        //Firebase need empty constructor
    }

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
        //this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
