
public class MyDynamicQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyNode head;
	
	//-------------------------------------------------------------------
	// Basic Operation --> Construct MyDynamicQueue
	//-------------------------------------------------------------------		
	public MyDynamicQueue(){
		this.head = null; //starting off as a null value
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyDynamicQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){
		return (head == null);//testing the condition to be true

	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyDynamicQueue: first
	//-------------------------------------------------------------------
	public int first(){
		int first = head.getInfo();//so from the the getInfo method we set it to head
		return first;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyDynamicQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){
		 MyNode currentNode = head;//creating new node object
	     MyNode newNode = new MyNode(element, null);
	     
        if(isEmpty()) {
            head = newNode;//add a new node
        } else {
        	while(currentNode.getNext() != null)//if not equals to null add a new one
        		currentNode = currentNode.getNext();
        	    currentNode.setNext(newNode);//inserting element here
       		}
       
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyDynamicQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){
		MyNode temp = head;//putting first in a temporary variable
		if(!isEmpty()){//checking if its empty first then if not return temp variable
			head = head.getNext();
		}else{
			System.out.println("Its empty");
		}
		    //return temp; //its giving out to me
	}
	
}