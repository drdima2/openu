package openu.irina.maman15.impl2;


public class Set {

    private IntNode _head;
    private IntList list = new IntList();

    public Set(int... elements) {
        for (int i = 0; i < elements.length; i++) {
            if (!isMember(elements[i])) {
                //add(elements[i]);
                addToSet(elements[i]);
            }
        }
    }

    /**
     * required method
     *
     * @param v
     */
    public void addToSet(int v) {
        if (_head == null) {
            _head = new IntNode(v, null);
            list = new IntList(_head);
        } else {
            list.add(v);
        }
    }


    /**
     * required method
     *
     * @param other
     * @return
     */
    public Set union(Set other) {
        return null;
    }

    /**
     * required method
     *
     * @return
     */
    public boolean isEmpty() {
        return list.empty();
    }

    /**
     * required method
     *
     * @param num
     * @return
     */
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

    private boolean isLast(IntNode node) {
        return node.getNext() == null;
    }


    /**
     * required method
     *
     * @return
     */
    public int numOfElements() {
        return list.length();
    }


    /**
     * required method
     *
     * @param other
     * @return
     */
    public boolean equals(Set other) {
        return subSet(other, true);
    }

    /**
     * required method
     *
     * @param other
     * @return
     */
    public boolean subSet(Set other) {
        return subSet(other, false);
    }


    private boolean subSet(Set other, boolean isEqual) {
        return false;
    }

    /**
     * required method
     *
     * @param x
     */
    public void removeFromSet(int x) {
        list.remove(x);
    }

    /**
     * required method
     *
     * @return
     */
    @Override
    public String toString() {
        return null;
    }

    public void print() {
        list.printList();
    }





    /**
     * required method
     *
     * @param other
     * @return
     */
    public Set intersection(Set other) {
        return null;
    }


    /**
     * required method
     *
     * @param other
     * @return
     */
    public Set difference(Set other) {
        return null;
    }

}
