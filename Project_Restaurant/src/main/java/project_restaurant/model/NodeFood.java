
package project_restaurant.model;


public class NodeFood {

    private Food data;
    private NodeFood next;

    public NodeFood(Food data) {
        this.data = data;
    }

    public Food getData() {
        return data;
    }

    public void setData(Food data) {
        this.data = data;
    }

    public NodeFood getNext() {
        return next;
    }

    public void setNext(NodeFood next) {
        this.next = next;
    }

}
