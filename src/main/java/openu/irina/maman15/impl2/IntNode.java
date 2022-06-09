package openu.irina.maman15.impl2;

public class IntNode {
    private int _value;
    private IntNode _next;



    public IntNode(int v, IntNode n) {
        _value = v;
        _next = n;
    }

    public IntNode(int v) {
        this._value = v;
        this._next = null;
    }

    public int getValue() {
        return _value;
    }

    public IntNode getNext() {
        return _next;
    }

    public void setValue(int v) {
        _value = v;
    }

    public void setNext(IntNode n) {
        _next = n;
    }
}
