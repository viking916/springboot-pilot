package com.springboot.pilot.springbootpilot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pilot.springbootpilot.courses.bean.Course;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Learn web3 dev", "viking"), new Course(2, "Learn next dev", "viking"));
    }

    @GetMapping("courses/1")
    public Course getCourseDetails() {
        return new Course(1, "Learn web3 development", "viking");
    }
}
