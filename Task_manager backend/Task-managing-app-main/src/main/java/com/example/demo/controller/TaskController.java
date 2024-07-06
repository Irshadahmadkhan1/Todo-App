package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

	@Autowired
	private TaskService taskService;

	// Get all tasks
	@GetMapping("/tasks")
	public List<Task> getAllTasks() {
		logger.debug("Request received to get all tasks.");
		return taskService.getAllTask();
	}

	// Create a new task
	@PostMapping("/tasks")
	public void createTask(@RequestBody @Valid Task task) {
		logger.debug("Request received to create a new task.");
		 taskService.saveTask(task);
	}

	// Get a task by ID
	@GetMapping("/tasks/{id}")
	public Task getTaskById(@PathVariable Long id) {
		logger.debug("Request received to get task by ID: {}", id);
		return taskService.getTaskById(id);
	}

	// Update a task
	@PutMapping("/tasks/{id}")
	public void updateTask(@PathVariable Long id, @RequestBody @Valid Task task) {
		logger.debug("Request received to update task with ID: {}", id);
		task.setId(id);
		 taskService.saveTask(task);
	}

	// Delete a task
	@DeleteMapping("/tasks/{id}")
	public void deleteTask(@PathVariable Long id) {
		logger.debug("Request received to delete task with ID: {}", id);
		taskService.deleteTaskById(id);
	}

	// Mark task as complete
	@PutMapping("/tasks/{id}/complete")
	public void completeTask(@PathVariable Long id) {
		logger.debug("Request received to mark task as complete with ID: {}", id);
		Task task = taskService.getTaskById(id);
		task.setCompleted(true);
		taskService.saveTask(task);
	}
}
