package com.baoyinxiaofei.jpa.native_query.service;

import com.baoyinxiaofei.jpa.native_query.entity.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {

	 List<Object[]> listStudent();

     List<Student> listStudentModel();

     List<Map<Object, Object>> listStudentMap();

     void batchSave();

     void statsDemo()throws Exception;
}
