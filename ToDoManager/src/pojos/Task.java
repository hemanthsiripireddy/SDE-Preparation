package pojos;

public class Task {
	private String taskID;
	private String title;
	private String description;
	private String assignedTo="not assigned to any one";
	private String completionDate;
	private boolean isCompleted=false;
	public Task(String taskID, String title, String description) {
		super();
		this.taskID = taskID;
		this.title = title;
		this.description = description;
	}
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	@Override
	public String toString() {
		return "Task [taskID=" + taskID + ", title=" + title + ", description=" + description + ", assignedTo="
				+ assignedTo + ", completionDate=" + completionDate + ", isCompleted=" + isCompleted + "]";
	}
	

}
