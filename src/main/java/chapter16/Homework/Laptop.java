package chapter16.Homework;

public class Laptop {
    private InsertDrawable insertDrawable;

    public Laptop() {
    }

    public Laptop(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    public void ReadyToConnect(){
        insertDrawable.connect();
    }
}
