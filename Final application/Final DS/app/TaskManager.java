package app;

import java.util.Scanner;

public class TaskManager {
	
	private TaskList taskList;
	private TaskQueue completedTasksQueue;
	private TaskStack urgentTaskStack;
	private CategoryList categoryList;
	
	public TaskManager() {
		taskList=new TaskList();
		completedTasksQueue = new TaskQueue();
		urgentTaskStack =new TaskStack();
		categoryList = new CategoryList();
}
	public void manageTasks() {
		
		Scanner scanner=new Scanner(System.in);
		 int choice;
	        do {
	            System.out.println("What do you want to do?");
	            System.out.println("1. Add new Task");
	            System.out.println("2. Remove Task");
	            System.out.println("3. Show completed tasks");
	            System.out.println("4. Show urgent tasks");
	            System.out.println("5. Category");
	            System.out.println("6. Show all the tasks");
	            System.out.println("0. Exit");

	            try {
	                choice = getUserChoice(scanner);

	                switch (choice) {
	                    case 1:
	                        addNewTask(scanner);
	                        break;
	                    case 2:
	                        removeTask(scanner);
	                        break;
	                    case 3:
	                        showCompletedTasks();
	                        break;
	                    case 4:
	                        urgentTaskStack.displayStack();
	                        break;
	                    case 5:
	                        categoryList.displayCategories();
	                        break;
	                    case 6:
	                        taskList.displayTasks();
	                        break;
	                    case 0:
	                        System.out.println("Exiting...");
	                        break;
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                }
	            } catch (Exception e) {
	                System.out.println("An error occurred: " + e.getMessage());
	                e.printStackTrace();
	                choice = -1; // Reset choice to stay in the loop if an error occurs
	            }

	        } while (choice != 0);
	    }
	//add task function

	    private void addNewTask(Scanner scanner) {
	        System.out.print("Enter task description: ");
	        String description = scanner.nextLine().trim();

	        System.out.print("Enter due date (YYYY-MM-DD): ");
	        String dueDate = scanner.nextLine().trim();

	        System.out.print("Is this task urgent? (yes/no): ");
	        String urgencyInput = scanner.nextLine().trim().toLowerCase();
	        boolean isUrgent = urgencyInput.equals("yes");

	        System.out.print("Enter the category for the task: ");
	        String categoryName = scanner.nextLine().trim();

	        categoryList.addCategory(categoryName);
	        Category category = categoryList.getCategory(categoryName);

	        Task newTask = new Task(description, dueDate, isUrgent);
	        category.getTaskList().addTask(newTask);

	        if (isUrgent) {
	            urgentTaskStack.push(newTask);
	        }

	        taskList.addTask(newTask);
	        System.out.println("Task added successfully.");
	    }
	    
	    //remove task function
	    private void removeTask(Scanner scanner) {
	        taskList.displayTasks();
	        System.out.print("Enter the number of the task you want to remove: ");
	        int taskNumber = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        Task removedTask = taskList.removeTask(taskNumber - 1);
	        if (removedTask != null) {
	            completedTasksQueue.enqueue(removedTask);
	            System.out.println("Task removed successfully.");
	        }
	    }
	    
	    //show the completed tasks
	    private void showCompletedTasks() {
	        completedTasksQueue.displayQueue();
	    }
	    
	    
	    private int getUserChoice(Scanner scanner) {
	        int choice;
	        do {
	            System.out.print("Enter your choice: ");
	            while (!scanner.hasNextInt()) {
	                System.out.print("Please enter a number: ");
	                scanner.next();
	            }
	            choice = scanner.nextInt();
	        } while (choice < 0 || choice > 6);
	        scanner.nextLine(); // Consume newline
	        return choice;
	    }
	}

	
