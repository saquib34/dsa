class MyQueue {

    int front, rear,count;
	int arr[] = new int[100005];
	int n=100005;

    MyQueue()
	{
		front=0;
		rear=0;
		count=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	
	    arr[rear%n]=x;
	    rear++;
	    count++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(count==0){
		    return -1;
		}
		int temp=arr[front];
		arr[front%n]=-1;
		front++;
		count--;
		return temp;
	} 
}
