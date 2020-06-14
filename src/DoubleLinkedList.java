/**
 * @author ruettiger
 * @version V1.0
 * 双向链表
 */
public class DoubleLinkedList {
    int val;
    DoubleLinkedList pre;
    DoubleLinkedList next;

    public DoubleLinkedList(int val, DoubleLinkedList pre, DoubleLinkedList next) {
        this.val = val;
        this.pre = pre;
        this.next = next;
    }

    /**
     * 添加节点
     *
     * @param node 节点
     * @return true 添加成功 false 添加失败
     */
    public boolean addNode(DoubleLinkedList node) {
        return false;
    }

    /**
     * 删除节点
     *
     * @param node 节点
     * @return true 删除节点 false 删除节点
     */
    public boolean deleteNode(DoubleLinkedList node) {
        return false;
    }

    /**
     * 插入节点
     *
     * @param position 节点位置
     * @param node     节点
     * @param before   插入节点前还是后
     * @return true 插入成功 false 插入失败
     */
    public boolean insertNode(DoubleLinkedList position, DoubleLinkedList node, boolean before) {
        return false;
    }

    /**
     * 查询节点
     *
     * @param node 节点
     * @return 返回节点位置 没有找到则返回-1
     */
    public int searchNode(DoubleLinkedList node) {
        return -1;
    }
}
