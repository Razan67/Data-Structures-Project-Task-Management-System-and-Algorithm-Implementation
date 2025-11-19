package app;

public class QueueNode {

	public Task task;
    public QueueNode next;

    public QueueNode(Task task) {
        this.task = task;
        this.next = null;
    }
	
}
