package com.maksim.durov.simplenotes.models;

public class Note {

    private int id;
    private String content;
    private long lastChangeTime;

    public Note() {}

    public Note(int id,String content, long lastChangeTime) {
        this.id =id;
        this.content = content;
        this.lastChangeTime = lastChangeTime;
    }

    //title is first 12 symbols of content + "..." if content <= 15 then just only content
    public String getTitle(){
        return content.length()>15?content.substring(0,12)+"...":content;
    }


    public String getDateStamp(){
        //TODO later replace this hardcode data with real date stamp witch parse from lastChangeTime
        return "20 JAN \\n2019";
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

    public long getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(long lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }
}
