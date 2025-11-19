package app;

public class Category {
	
	 private String name;
	    private TaskList taskList;

	    public Category(String name) {
	        this.name = name;
	        this.taskList = new TaskList();
	    }

	    public String getName() {
	        return name;
	    }

	    public TaskList getTaskList() {
	        return taskList;
	    }

}
