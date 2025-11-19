package app;

public class TaskStack {
	
	private StackNode top;

    public TaskStack() {
        this.top = null;
    }

    public void push(Task task) {
        StackNode newNode = new StackNode(task);
        newNode.next = top;
        top = newNode;
    }

    public Task pop() {
        if (top == null) {
        	System.out.println("Stack is empty.");
            return null;
        }
        StackNode temp = top;
        top = top.next;
        return temp.task;
    }

    public void displayStack() {
    	
    	 if (top == null) {
             System.out.println("No urgent tasks.");
             return;
         }
        StackNode current = top;
        System.out.println("Urgent Tasks Stack:");
        while (current != null) {
            System.out.println("Description: " + current.task.getDescription() + ", Due Date: " + current.task.getDueDate());
            current = current.next;
        }
    }

}
