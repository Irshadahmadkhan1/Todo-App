package com.example.demo.service;

import com.example.demo.model.Task;

import java.util.List;

public interface TaskService {
	List<Task> getAllTask();
	void saveTask(Task task);
	
	Task getTaskById(long id);
	void deleteTaskById(long id);
	boolean updateStatus(long id);



}
