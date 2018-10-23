package com.baoyinxiaofei.jpa.native_query.controller;

import com.baoyinxiaofei.jpa.native_query.entity.Result;
import com.baoyinxiaofei.jpa.native_query.entity.Student;
import com.baoyinxiaofei.jpa.native_query.service.IStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Api(tags ="测试接口")
@RestController
@RequestMapping("/test")
public class StudentController {
	private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private IStudentService studentService;
	
	@ApiOperation(value="学生List")
	@PostMapping("/list")
	public Result list(HttpServletRequest request){
		LOGGER.info("学生List");
		List<Object[]> list = studentService.listStudent();
		return Result.ok(list);
	}
	@ApiOperation(value="学生Map")
	@PostMapping("/listMap")
	public Result listMap(HttpServletRequest request){
		LOGGER.info("学生Map");
		List<Map<Object, Object>> list = studentService.listStudentMap();
		return Result.ok(list);
	}
	@ApiOperation(value="学生Model")
	@PostMapping("/listModel")
	public Result listModel(HttpServletRequest request){
		LOGGER.info("学生Model");
		List<Student> list = studentService.listStudentModel();
		return Result.ok(list);
	}
}
