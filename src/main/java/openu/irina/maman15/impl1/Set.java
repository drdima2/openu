package openu.irina.maman15.impl1;

public class Set {
    private IntNode head;

    public Set(int... elements) {
        for (int i = 0; i < elements.length; i++) {
            addToSet(elements[i]);
        }
    }

    public Set(Set set) {
        IntNode node = set.head;
        while (node != null) {
            addToSet(node.getValue());
            node = node.getNext();
        }
    }

    public Set union(Set other) {
        Set newSet = new Set(this);
        IntNode node = other.head;
        while (node != null) {
            newSet.addToSet(node.getValue());
            node = node.getNext();
        }
        return newSet;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean isMember(int num) {
        if (isEmpty()) {
            return false;
        }
        IntNode current = this.head;
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
        return numOfElements(this.head, 1);
    }

    private int numOfElements(IntNode node, int i) {
        if (isEmpty()) {
            return 0;
        }
        if (isLast(node)) {
            return i;
        }
        return numOfElements(node.getNext(), ++i);

    }

    public boolean equals(Set other) {
        return subSet(other, true);
    }

    public boolean subSet(Set other) {
        return subSet(other, false);
    }


    private boolean subSet(Set other, boolean isEqual) {
        if (other == null) {
            return false;
        }
        if (other.numOfElements() > this.numOfElements()) {
            return false;
        }
        if (isEqual) {
            if (this.numOfElements() != other.numOfElements()) {
                return false;
            }
        }
        boolean found = false;
        for (int i = 0; i < other.numOfElements(); i++) {
            int otherValue = other.getValueByIndex(i);
            for (int j = 0; j < this.numOfElements(); j++) {
                int thisValue = this.getValueByIndex(j);
                if (otherValue == thisValue) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            } else {
                found = false;
            }
        }
        return true;
    }


    public void addToSet(int x) {
        if (isMember(x)) return;
        IntNode newNode = new IntNode(x, null);
        if (isEmpty()) {
            this.head = newNode;
        } else {
            IntNode lastNode = getLastNode(this.head);
            lastNode.setNext(newNode);
        }
    }

    private IntNode getLastNode(IntNode node) {
        if (isLast(node)) {
            return node;
        } else {
            return getLastNode(node.getNext());
        }

    }

    public void removeFromSet(int x) {
        IntNode prev = null;
        IntNode current = this.head;
        while (true) {
            if (current.getValue() == x) {
                if (prev == null) {
                    this.head = current.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
                return;
            } else {
                if (isLast(current)) {
                    throw new RuntimeException("Not found element " + x);
                }
                prev = current;
                current = current.getNext();
            }
        }
    }

    private boolean isLast(IntNode node) {
        return node.getNext() == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        IntNode node = this.head;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(node.getValue());
            if (!isLast(node)) {
                sb.append(",");
            } else {
                break;
            }
            node = node.getNext();
        }
        return sb.toString();
    }

    private int getValueByIndex(int i) {
        if (isEmpty()) {
            throw new IllegalArgumentException("set is empty");
        }
        IntNode node = getNodeByIndex(this.head, i);
        return node.getValue();

    }

    private IntNode getNodeByIndex(IntNode node, int i) {
        if (i == 0) {
            return node;
        }
        return getNodeByIndex(node.getNext(), --i);
    }

    public Set intersection(Set other) {
        return intersection(other,true);
    }

    public Set intersection(Set other, boolean isIntersection) {
        Set newSet = new Set();
        IntNode node = other.head;
        while (node!=null){
            int value = node.getValue();
            if (isIntersection){
                if(isMember(value)){
                    newSet.addToSet(value);
                }
            } else {
                // TODO wrong logic. diff is when element not exists in both sets
                if(!isMember(value)){
                    newSet.addToSet(value);
                }
            }

            node = node.getNext();
        }
        return newSet;
    }


    public Set difference(Set other) {
        return intersection(other,false);
    }

}
