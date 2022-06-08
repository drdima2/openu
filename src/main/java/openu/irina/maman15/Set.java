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
        IntNode current = this.head;
        while (true){
            if (current.getValue()==num){
                return true;
            }else {
                if (isLast(current)){
                    return false;
                }
                current = current.getNext();
            }
        }
    }

    public boolean equals(Set other) {
        return false;
    }

    public int numOfElements() {
        return numOfElements(this.head,1);
    }

    private int numOfElements(IntNode node, int i){
        if (isEmpty()){
            return 0;
        }
        if (isLast(node)){
            return i;
        }
        return numOfElements(node.getNext(), ++i);

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
        if (isLast(node)) {
            return node;
        } else {
            return getLastNode(node.getNext());
        }

    }

    public void removeFromSet(int x) {
        IntNode prev = null;
        IntNode current = this.head;
        while (true){
            if (current.getValue()==x){
                if (prev==null){
                    this.head = current.getNext();
                }
                else {
                    prev.setNext(current.getNext());
                }
                return;
            }else {
                if (isLast(current)){
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
        if (isEmpty()){
            return "";
        }
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

    /*private int getElementByIndex(int i) {
        if (isEmpty()) {
            throw new IllegalArgumentException("set is empty");
        }
        IntNode node = getNodeByIndex(this.head, 2);
        return node.getValue();

    }*/

    /*private IntNode getNodeByIndex(IntNode node, int i) {
        if (i == 0) {
            return node;
        }
        return getNodeByIndex(node.getNext(), --i);
    }*/

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
