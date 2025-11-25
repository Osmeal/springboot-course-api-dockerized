package io.javabrains.springbootstarter.lesson;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.course.Course;

@RestController
public class LessonController {

	@Autowired
	private LessonService courseService;

	@RequestMapping("/topic/{topicId}/course/{id}/lessons")
	public List<Lesson> getAllCoursers(@PathVariable String id) {
		return courseService.getAllLessons(id);
	}

	@RequestMapping("/topic/{topicId}/course/{courseId}/lesson/{id}")
	public Optional<Lesson> getCourse(@PathVariable String id) {
		return courseService.getLesson(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topic/{topicId}/course/{courseId}/lesson")
	public void addCourse(@RequestBody Lesson lesson, @PathVariable String courseId) {
		lesson.setCourse(new Course(courseId, "", "", ""));
		courseService.addLesson(lesson);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topic/{topicId}/course/{courseId}/lesson/{id}")
	public void updateCourse(@RequestBody Lesson lesson, @PathVariable String courseId, @PathVariable String id) {
		lesson.setCourse(new Course(courseId, "", "", ""));
		courseService.updateLesson(lesson);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topic/{topicId}/course/{courseId}/lesson/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteLesson(id);
	}
}
