class TaskManager {
    class Task {
        int userId;
        int taskId;
        int priority;

        Task(int userId, int taskId, int priority) {
            this.userId = userId; this.taskId = taskId; this.priority = priority;
        }
    }
    private Map<Integer, Task> taskIdToTask;
    private TreeSet<Task> taskSet;
    public TaskManager(List<List<Integer>> tasks) {
        taskSet = new TreeSet<>((task1, task2) -> {
            if(task2.priority == task1.priority) return task2.taskId - task1.taskId;
            return task2.priority - task1.priority;
        });
        taskIdToTask = new HashMap<>();
        for(List<Integer> task : tasks) {
            Task taskObj = new Task(task.get(0), task.get(1), task.get(2));
            taskIdToTask.put(task.get(1), taskObj);
            taskSet.add(taskObj);
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        Task taskObj = new Task(userId, taskId, priority);
        taskIdToTask.put(taskId, taskObj);
        taskSet.add(taskObj);
    }
    
    public void edit(int taskId, int newPriority) {
        Task taskObj = taskIdToTask.get(taskId);
        Task updatedTaskObj = new Task(taskObj.userId, taskObj.taskId, newPriority);
        taskIdToTask.put(taskId, updatedTaskObj);
        taskSet.remove(taskObj);
        taskSet.add(updatedTaskObj);
    }
    
    public void rmv(int taskId) {
        Task taskObj = taskIdToTask.get(taskId);
        taskSet.remove(taskObj);
        taskIdToTask.remove(taskId);
    }
    
    public int execTop() {
        if(taskSet.size() == 0) return -1;
        Task highest = taskSet.first();
        taskSet.remove(highest);
        return highest.userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */