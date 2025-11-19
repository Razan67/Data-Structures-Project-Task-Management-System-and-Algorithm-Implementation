package app;

public class Task {
	
	private String description;
	private String dueDate;
	private boolean isUrgent;
	
	
	public Task(String description, String dueDate, boolean isUrgent) {
        this.description = description;
        this.dueDate = dueDate;
        this.isUrgent=isUrgent;
    }

   

	public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }
    
    public boolean isUrgent() {
        return isUrgent;
    }
}

