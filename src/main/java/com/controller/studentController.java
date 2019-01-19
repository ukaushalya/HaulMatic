/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kaushi
 */
@RestController()
@RequestMapping("/studentPortal")
public class studentController {
    
 private final String sharedKey = "SHARED_KEY";
 private static final String SUCCESS_STATUS = "success";
 private static final String ERROR_STATUS = "error";
 private static final int CODE_SUCCESS = 100;
 private static final int AUTH_FAILURE = 102;
 
 @RequestMapping(value = "/postDetails", method = RequestMethod.POST)
 public BaseResponse studentDetails(@RequestParam(value = "key") String key,@RequestBody Student request){
     
     BaseResponse response = new BaseResponse();
  if (sharedKey.equalsIgnoreCase(key)) {
   int id = request.getStdentId();
   String name = request.getStudentName();
   int age = request.getStudentAge();
     

   response.setStatus(SUCCESS_STATUS);
   response.setCode(CODE_SUCCESS);
  } else {
   response.setStatus(ERROR_STATUS);
   response.setCode(AUTH_FAILURE);
  }
  return response;
   
 }
 
 @RequestMapping(value = "/postModuleDetails", method = RequestMethod.POST)
 public BaseResponse moduleDetails(@RequestParam(value = "key") String key,@RequestBody Module request){
 
     
     BaseResponse response = new BaseResponse();
     
     List<Student> studentData = new ArrayList<Student>();
     if (sharedKey.equalsIgnoreCase(key)) {
         int modid = request.getModuleId();
         String modname = request.getModuleName();
         int age = request.getStudentAge();

         response.setStatus(SUCCESS_STATUS);
         response.setCode(CODE_SUCCESS);
     } else {
         response.setStatus(ERROR_STATUS);
         response.setCode(AUTH_FAILURE);
     }
     return response;

        
 
 }
 
@RequestMapping(value = "/getStudentDetails", method = RequestMethod.GET)
public Student getStudentDetails(@RequestParam(value = "key") String key,@RequestBody Student request) {
		
		Student emp = new Student();
		
		emp.setStudentName("Dummy");
		emp.setStudentAge(23);
//		return emp;
	
     return emp;
}

 
@RequestMapping(value = "/getModuleDetails", method = RequestMethod.GET)
public Student getModuleDetails(@RequestParam(value = "key") String key,@RequestBody Module request) {
		
		Module mod = new Module();
		List<Student> studentList = new ArrayList<Student>();
		mod.setModuleName("Dummy");
		mod.setList(studentList);
//		return emp;
	
     return mod;
}


 
 
 
}
