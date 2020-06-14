import linklist.*;

public class main {
    public static void main(String[] args) {
        TestSignleLinkList();
    }

    private static void TestSignleLinkList() {
        int[] val = new int[]{1, 2, 44, 5, 6, 67, 4, 4, 4};
        SingleLinkList singleLinkList = new SingleLinkList(1);
        for (int i = 0; i < val.length; i++) {
            singleLinkList.addNode(new SingleLinkList(val[i]));
        }
        singleLinkList.printLinkList();
        System.out.println(singleLinkList.deleteNode(new SingleLinkList(44)));
        singleLinkList.printLinkList();
        System.out.println(singleLinkList.insertNode(new SingleLinkList(5), new SingleLinkList(7), true));
        singleLinkList.printLinkList();
        System.out.println(singleLinkList.insertNode(new SingleLinkList(400), new SingleLinkList(6), false));
        singleLinkList.printLinkList();
    }
}
