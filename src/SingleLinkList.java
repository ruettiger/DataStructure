/**
 * @author ruettiger
 * @version V1.0
 * 学习数据结构和算法优先要精通常用数据结构，这是一个单链表数据结构练习
 * javadoc -d SingleLinkListDoc -author -version SingleLinkList.java
 */
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

    /**
     * 删掉指定节点
     * @param node
     */
    public void deleteNode(SingleLinkList node) {
        SingleLinkList currentNode = this;
        while (currentNode.next != null) {
            if (currentNode.val == node.val) {
                currentNode = currentNode.next;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    /**
     * 添加节点
     * @param node
     */
    public void addNode(SingleLinkList node) {
        SingleLinkList currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    /**
     * 插入节点
     * @param node
     */
    public void insertNode(SingleLinkList node) {

    }

    /**
     * 打印链表节点的值
     */
    public void printLinkList() {
        SingleLinkList head = this;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
