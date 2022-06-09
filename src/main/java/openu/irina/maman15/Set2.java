package openu.irina.maman15;

public class Set2 {
    private IntList head;

    public Set2(int... elements) {
        for (int i = 0; i < elements.length; i++) {
            addToSet(elements[i]);
        }
    }


    public Set2 union(Set2 other) {
        return null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean isMember(int num) {
        return false;
    }


    public int numOfElements() {
        return 0;
    }

    private int numOfElements(IntNode node, int i) {
        return 0;
    }

    public boolean equals(Set2 other) {
        return subSet(other, true);
    }

    public boolean subSet(Set2 other) {
        return subSet(other, false);
    }


    private boolean subSet(Set2 other, boolean isEqual) {
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
        return false;
    }

    @Override
    public String toString() {
        return null;
    }

    private int getValueByIndex(int i) {
        return 0;
    }

    private IntNode getNodeByIndex(IntNode node, int i) {
        return null;
    }

    public Set2 intersection(Set2 other) {
        return null;
    }

    public Set2 intersection(Set2 other, boolean isIntersection) {
        return null;
    }


    public Set2 difference(Set2 other) {
        return null;
    }

}
