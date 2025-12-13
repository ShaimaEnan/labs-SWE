
package singlylinkelist;

public class singlylinkedlist<E> {
    private Node<E>head;
    private Node<E>tail;
    private int size=0;
    
    public int size(){
     return size;
    }
    
    public boolean isEmpty(){
    return size()==0;
    
    }
    public void addfirst(E data){
    
   Node<E> newNode=new Node(data,head);
   head=newNode;
   if(isEmpty())
      tail =head;
   
   
   size++;
        
    }
    public E getfirst(E data){
    
   if(isEmpty())return null;
   return head.getData();
        
    }
    
     public E removefirst(){
         
      if(isEmpty())return null;
      E delet= head.getData();
      head=head.getNext();
      size--;
      
      if (size()==0)
        tail =head;
      
      
    return delet;
    }
     
    public void addLast(E data){
     
   Node<E> newNode=new Node(data,null);
   if(isEmpty()){
     head=newNode;
   
    }
   else{
   tail.setNext(newNode);
   
   }
   tail=newNode;
   size++;
   
    }
    
 public E getLast(E data){
    
   if(isEmpty())return null;
   return tail.getData();
        
    }
 
  public E removeLast(){
      
  if(isEmpty())return null;
  E delete=tail.getData();
  if(head==tail){
      head=null;
      tail=null;
  
  }
  else{
  Node<E> temp=head;
  while(temp.getNext() !=tail){
      temp=temp.getNext();
  }
  temp.setNext(null);
  tail=temp;
  
  
  }
 
  size--;
 return delete;
  }
    
 public void display(){
  Node<E> temp=head;
  while(temp !=null){
      System.out.print(temp.getData()+"-------->");
      temp=temp.getNext();
  
  }
  System.out.println("null");
  
 
 
 }
 
 
 public void addpostion(E data,int postion){
 if(postion<=0||postion>size+1)
     throw new IllegalArgumentException("Invaild postion");
 
 if(postion==1){
     addfirst(data);
 return;
 }
 
 
 
 
 }
    
    class Node<E>{
    private E data;
    public Node<E>next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    
    
    }
    
    
    
}
