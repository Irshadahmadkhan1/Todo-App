package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service

public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository TaskRepository;

	@Override
	public List<Task> getAllTask() {
		// TODO Auto-generated method stub
		return TaskRepository.findAll();
	}
	@Override
	public boolean updateStatus(long id){
		Optional<Task> optionalTask = TaskRepository.findById(id);
		if (optionalTask.isPresent()) {
			Task task = optionalTask.get();
			if (!task.isCompleted()) {
				LocalDate today = LocalDate.now();
				if (task.getDate().isBefore(today)) {
					task.setCompleted(false);
					TaskRepository.save(task);
				} else {
					task.setCompleted(true);
					TaskRepository.save(task);
				}
			}
		}
		return false;
//
	}

	@Override
	public void saveTask(Task Task) {
		// TODO Auto-generated method stub
		this.TaskRepository.save(Task);

	}
	@Override
	public Task getTaskById(long id) {
		Optional<Task> optional =TaskRepository.findById(id);
		Task Task=null;
		if(optional.isPresent()) {
			Task=optional.get();
		}
		else {
			throw new RuntimeException("Task not found for id::"+ id);
		}
		return Task;
	}

	@Override
	public void deleteTaskById(long id) {
		this.TaskRepository.deleteById(id);
	}
}
