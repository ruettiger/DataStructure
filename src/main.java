public class main {
    public static void main(String[] args) {
        TestSignleLinkList();
    }

    private static void TestSignleLinkList() {
        SingleLinkList singleLinkList = new SingleLinkList(1);
        singleLinkList.addNode(new SingleLinkList(2));
        singleLinkList.addNode(new SingleLinkList(3));
        singleLinkList.addNode(new SingleLinkList(4));
        singleLinkList.addNode(new SingleLinkList(5));
        singleLinkList.printLinkList();
        singleLinkList.deleteNode(new SingleLinkList(3));
        singleLinkList.printLinkList();
    }
}
