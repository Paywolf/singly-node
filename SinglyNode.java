public class SinglyNode {
    private int data;
    private SinglyNode next;

    public SinglyNode(int data) {
        this(data, null);
    }

    public SinglyNode(int data, SinglyNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData()          { return this.data; }
    public void setData(int data) { this.data = data; }

    public SinglyNode getNext()          { return this.next; }
    public void setNext(SinglyNode next) { this.next = next; }
}