package app;

public class CategoryList {

	 private CategoryNode head;

	    public CategoryList() {
	        head = null;
	    }

	    public void addCategory(String name) {
	        if (head == null) {
	            head = new CategoryNode(new Category(name));
	        } else {
	            CategoryNode current = head;
	            while (current.next != null) {
	                if (current.category.getName().equalsIgnoreCase(name)) {
	                    return; // Category already exists
	                }
	                current = current.next;
	            }
	            if (current.category.getName().equalsIgnoreCase(name)) {
	                return; // Category already exists
	            }
	            current.next = new CategoryNode(new Category(name));
	        }
	    }

	    public Category getCategory(String name) {
	        CategoryNode current = head;
	        while (current != null) {
	            if (current.category.getName().equalsIgnoreCase(name)) {
	                return current.category;
	            }
	            current = current.next;
	        }
	        return null;
	    }

	    public void displayCategories() {
	        CategoryNode current = head;
	        System.out.println("Categories:");
	        while (current != null) {
	            System.out.println("- " + current.category.getName());
	            current.category.getTaskList().displayTasks();
	            current = current.next;
	        }
	    }
}
