package main;

public class StudentBean {

    private String name;
    private int note;

    public void setNote(int note) {
        this.note = note;
        if(note < 0) {
            this.note = 0;
        }
        else if(note>20){
            this.note = 20;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }


}
