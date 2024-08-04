package MyFile;
public class DNode {
    public int info;
    public DNode lptr;
    public DNode rptr;

    public DNode() {}

    public DNode(int x) {
        this.info = x;
        lptr = null;
        rptr = null;
    }

}
