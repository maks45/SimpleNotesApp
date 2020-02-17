package com.maksim.durov.simplenotes.models;

public class Note {

    private int id;
    private String content;
    private String lastChangeTime;

    public Note() {}

    public Note(int id,String content, String lastChangeTime) {
        this.id =id;
        this.content = content;
        this.lastChangeTime = lastChangeTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(String lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }
}
