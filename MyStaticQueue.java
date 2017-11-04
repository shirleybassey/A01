
public class MyStaticQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private int items [];//declaring my array
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStaticQueue is empty
	//-------------------------------------------------------------------
	
	//constructor
	public MyStaticQueue(int m){
		this.maxItems = m;//local to the method that can see it
		this.items = new int[this.maxItems]; //allowing it to link to maxItems to what that states
		this.numItems = 0; //starting at empty
	}
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStaticQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){
		return numItems == 0;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStaticQueue: first
	//-------------------------------------------------------------------
	public int first(){
		return items[0];//position 0 is the 1st position in the array
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyStaticQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){
		if(numItems <= maxItems - 1) {
			items[numItems] = element;
			numItems++;//add a new number 
			System.out.println(element);
		} else {
			System.out.println("Its full");
		}	
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStaticQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){
		for(int i = 0; i < numItems; i--)
		{
			//items[i] = items[i+1];//if items has a number
		}
		numItems --;//take it away
	}

}
