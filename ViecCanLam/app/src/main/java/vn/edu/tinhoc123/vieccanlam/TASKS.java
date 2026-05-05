package vn.edu.tinhoc123.vieccanlam;

import java.io.Serializable;
import java.util.HashMap;

public class TASKS implements Serializable {
    String name;
    String date;
    String message;
    String priority;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TASKS(String date, String message, String name, String priority) {
        this.date = date;
        this.message = message;
        this.name = name;
        this.priority = priority;
    }

    public TASKS() {
    }
    public HashMap<String,String> toFirebaseObject(){
        HashMap<String,String> taskObject = new HashMap<String,String>();
        taskObject.put("name",name);
        taskObject.put("date",date);
        taskObject.put("message",message);
        taskObject.put("priority",priority);
        return taskObject;
    }

}
