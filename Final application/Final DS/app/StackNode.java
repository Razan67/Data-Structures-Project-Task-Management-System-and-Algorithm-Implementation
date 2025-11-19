package app;

public class StackNode {

	public Task task;
    public StackNode next;

    public StackNode(Task task) {
        this.task = task;
        this.next = null;
    }
	
}
