package main;

public class AutomataToken {
    private String value;
    private int firstQ;
    private int lastQ;

    public AutomataToken(String value, int firstQ, int lastQ) {
        this.value = value;
        this.firstQ = firstQ;
        this.lastQ = lastQ;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getFirstQ() {
        return firstQ;
    }

    public void setFirstQ(int firstQ) {
        this.firstQ = firstQ;
    }

    public int getLastQ() {
        return lastQ;
    }

    public void setLastQ(int lastQ) {
        this.lastQ = lastQ;
    }
}
