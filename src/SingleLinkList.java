/**
 * @author ruettiger
 * @version V1.0
 * 学习数据结构和算法优先要精通常用数据结构，这是一个单链表数据结构练习
 * 1.单链表只要不改变后继next指向，就不会变更原始数据
 * 2.初始化，增，删，插入，查等基本操作
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
     * 添加节点
     *
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
     * 删掉指定节点
     *
     * @param node
     */
    public boolean deleteNode(SingleLinkList node) {
        if (node == null) return false;
        SingleLinkList preNode = null;
        SingleLinkList currentNode = this;
        while (currentNode.next != null) {
            preNode = currentNode;
            currentNode = currentNode.next;
            if (node.val == currentNode.val) {
                preNode.next = preNode.next.next;
                return true;
            }
        }
        return false;
    }

    /**
     * 插入节点
     *
     * @param positionNode
     * @param before
     * @return
     */
    public boolean insertNode(SingleLinkList positionNode, SingleLinkList node, boolean before) {
        if (node == null) return false;
        SingleLinkList preNode = null;
        SingleLinkList currentNode = this;
        while (currentNode.next != null) {
            preNode = currentNode;
            currentNode = currentNode.next;
            if (positionNode.val == currentNode.val) {
                if (before) {
                    node.next = currentNode;
                    preNode.next = node;
                } else {
                    node.next = currentNode.next;
                    currentNode.next = node;
                }
                return true;
            }
        }
        return false;
    }

    /**
     * 打印链表节点的值
     */
    public void printLinkList() {
        SingleLinkList head = this;
        while (head != null) {
            System.out.print(head.val + ",");
            head = head.next;
        }
        System.out.println();
    }
}
