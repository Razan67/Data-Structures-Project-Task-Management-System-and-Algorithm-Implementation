package app;

public class TaskList {

	
	private Node head;

    public TaskList() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null || task.getDueDate().compareTo(head.task.getDueDate()) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && task.getDueDate().compareTo(current.next.task.getDueDate()) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    public Task removeTask(int index) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return null;
        }
        if (index == 0) {
        	Task removedTask = head.task;
            head = head.next;
            return removedTask;
        }
        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid task index.");
            return null;
        }
        Task removedTask = current.next.task;
        current.next = current.next.next;
        return removedTask;
    }
    

    public void displayTasks() {
        Node current = head;
        int index = 1;

      
        System.out.println("Tasks:");
        while (current != null) {
            System.out.println(index + ". Description: " + current.task.getDescription() + ", Due Date: " + current.task.getDueDate());
            current = current.next;
            index++;
        }
    
    
    }}