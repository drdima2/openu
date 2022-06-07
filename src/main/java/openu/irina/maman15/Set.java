package openu.irina.maman15;

public class Set {
    private IntNode head;

    public Set(int... elements) {
        for (int i = 0; i < elements.length; i++) {
            addToSet(elements[i]);
        }

    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean isMember(int num) {
        return false;
    }

    public boolean equals(Set other) {
        return false;
    }

    public int numOfElements() {
        return 0;
    }

    public boolean subSet(Set other) {
        return false;
    }

    public void addToSet(int x) {
        IntNode newNode = new IntNode(x, null);
        if (this.head == null) {
            this.head = newNode;
        } else {
            IntNode lastNode = getLastNode(this.head);
            lastNode.setNext(newNode);
        }
    }

    private IntNode getLastNode(IntNode node) {
        if (node.getNext() == null) {
            return node;
        } else {
            return getLastNode(node.getNext());
        }

    }

    public void removeFromSet(int x) {

    }

    private boolean isLast(IntNode node) {
        return node.getNext() == null;
    }

    @Override
    public String toString() {
        IntNode node = this.head;
        StringBuilder sb = new StringBuilder();
        while (true){
            sb.append(node.getValue());
            if (!isLast(node)) {
                sb.append(",");
            }
            else {
                break;
            }
            node = node.getNext();
        }
        return sb.toString();
    }

    private int getElementByIndex(int i) {
        if (isEmpty()) {
            throw new IllegalArgumentException("set is empty");
        }
        IntNode node = getNodeByIndex(this.head, 2);
        return node.getValue();

    }

    private IntNode getNodeByIndex(IntNode node, int i) {
        if (i == 0) {
            return node;
        }
        return getNodeByIndex(node.getNext(), --i);
    }

    public Set intersection(Set other) {
        return null;
    }

    public Set union(Set other) {
        return null;
    }

    public Set difference(Set other) {
        return null;
    }
}
