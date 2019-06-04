package com.db.hack.wise.service;

import java.util.List;

import com.db.hack.wise.model.StudentQuestions;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public interface StudentQuestionService {
	public StudentQuestions get(int id);
	public List<StudentQuestions> getAll();
	public StudentQuestions update(StudentQuestions studentQuestion);
	public void delete(int id);
	public StudentQuestions save(StudentQuestions studentQuestion);
}
