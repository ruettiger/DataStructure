public class SingleLinkList {
    int val;
    SingleLinkList next;

    public SingleLinkList(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public SingleLinkList getNext() {
        return next;
    }

    public void setNext(SingleLinkList next) {
        this.next = next;
    }

    public void deleteNode(SingleLinkList node) {
        SingleLinkList currentNode = this;
        while (currentNode.next != null) {
            if (currentNode.val == node.val) {
                currentNode.next = currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void addNode(SingleLinkList node) {
        SingleLinkList currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    public void insertNode(SingleLinkList node) {

    }

    public void printLinkList() {
        SingleLinkList head = this;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
