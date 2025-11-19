package app;

public class TaskQueue {

	private QueueNode front, rear;

    public TaskQueue() {
        this.front = this.rear = null;
    }

    public void enqueue(Task task) {
        QueueNode newNode = new QueueNode(task);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public Task dequeue() {
        if (this.front == null) {
            return null;
        }
        QueueNode temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return temp.task;
    }

    public void displayQueue() {
        QueueNode current = front;
        System.out.println("Completed Tasks:");
        while (current != null) {
            System.out.println("Description: " + current.task.getDescription() + ", Due Date: " + current.task.getDueDate());
            current = current.next;
        }
    }
}
