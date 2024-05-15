
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
    
    public String getFood(int index){      
        if(data != null){
            switch(index){
                case 0:                    
                      return data.getName();
                case 1:
                      return String.valueOf(data.getPrice());
                default:
                      return "";
            }
        }else{
           return "";
        }                
    }

}
