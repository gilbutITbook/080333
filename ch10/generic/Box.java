package ch10.generic;

public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

/*public class Box {
    private Object content;
    public void setContent(Object content) {
        this.content = content;
    }
    public Object getContent() {
        return content;
    }
}*/
