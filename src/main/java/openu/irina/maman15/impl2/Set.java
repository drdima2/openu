package openu.irina.maman15.impl2;



public class Set {

    private IntNode _head;
    private IntList list = new IntList();

    public Set(int... elements) {
        for (int i = 0; i < elements.length; i++) {
            if (!isMember(elements[i])) {
                add(elements[i]);
                //addToSet(elements[i]);
            }
        }
    }

    public void add(int v){
        if (_head==null){
            _head = new IntNode(v,null);
            list=new IntList(_head);
        }
        else {
            list.add(v);
        }
    }


    public Set union(Set other) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isMember(int num) {
        if (list.empty()) {
            return false;
        }
        IntNode current = this._head;
        while (true) {
            if (current.getValue() == num) {
                return true;
            } else {
                if (isLast(current)) {
                    return false;
                }
                current = current.getNext();
            }
        }
    }


    public int numOfElements() {
        return list.length();
    }

    private int numOfElements(IntNode node, int i) {
        return 0;
    }

    public boolean equals(Set other) {
        return subSet(other, true);
    }

    public boolean subSet(Set other) {
        return subSet(other, false);
    }


    private boolean subSet(Set other, boolean isEqual) {
        return false;
    }


    public void addToSet(int x) {

    }

    private IntNode getLastNode(IntNode node) {
        return null;
    }

    public void removeFromSet(int x) {

    }

    private boolean isLast(IntNode node) {
        return node.getNext() == null;
    }

    @Override
    public String toString() {
        return null;
    }

    public void print(){
        list.printList();
    }

    private int getValueByIndex(int i) {
        return 0;
    }

    private IntNode getNodeByIndex(IntNode node, int i) {
        return null;
    }

    public Set intersection(Set other) {
        return null;
    }

    public Set intersection(Set other, boolean isIntersection) {
        return null;
    }


    public Set difference(Set other) {
        return null;
    }

}
