package io.javabrains.springbootstarter.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

	@Autowired
	private LessonRepository courseRepository;

	public List<Lesson> getAllLessons(String courseId) {
		List<Lesson> courses = new ArrayList<>();
		courseRepository.findByCourseId(courseId).forEach(courses::add);
		return courses;
	}

	public Optional<Lesson> getLesson(String id) {
		return courseRepository.findById(id);
	}

	public void addLesson(Lesson lesson) {
		courseRepository.save(lesson);
	}

	public void updateLesson(Lesson lesson) {
		courseRepository.save(lesson);
	}

	public void deleteLesson(String id) {
		courseRepository.deleteById(id);
	}

}
