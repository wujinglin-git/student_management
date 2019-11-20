package com.wjl.student_management.controller;

import com.wjl.student_management.common.util.ResponseResult;
import com.wjl.student_management.dao.param.StudentParam;
import com.wjl.student_management.entity.Major;
import com.wjl.student_management.entity.Student;
import com.wjl.student_management.service.MajorService;
import com.wjl.student_management.service.StudentService;
import com.wjl.student_management.utils.FileHandleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/10/13 16:39
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Controller
public class StudentController {



    @Autowired
    StudentService studentService;

    @Autowired
    MajorService majorService;



    @ModelAttribute
    public List<Major> majorList(Model model,HttpSession session){
        List<Major> list= new ArrayList<>();
              list =  majorService.findById((int)session.getAttribute("schoolId"));
        model.addAttribute("major",list);
        return list;
    }

    @ModelAttribute
    public List<Major> allMajor(Model model){
        List<Major> list= new ArrayList<>();
        list =  majorService.findMajor();
        model.addAttribute("allMajor",list);
        return list;
    }
    /**
     * 查询所有学生
     */

    @GetMapping("/toStudent")
    public String toStudent(Integer pageNum, Model model,StudentParam studentParam) {

        return "student/studentManager";
    }

    @GetMapping("/students")
    public String findAll(Integer pageNum, Model model,StudentParam studentParam){
       List<Student> list = studentService.search(studentParam);
       model.addAttribute("student",list);
        return "student/studentManager";
    }

    @GetMapping("/proStudents")
    public String proFind(Integer pageNum, Model model,StudentParam studentParam){
        List<Student> list = studentService.search(studentParam);
        model.addAttribute("student",list);
        return "province/provinceManager";
    }

    @GetMapping("/province")
    public String find(Integer pageNum, Model model,StudentParam studentParam){
        List<Student> list = studentService.search(studentParam);
        model.addAttribute("student",list);
        return "province/provinceManager";
    }
    /**
     * 添加学生
     */
    @PostMapping("/student")

    public String add(HttpSession session, Model model, Integer pageNum, Student student){
        String path = "image/";
        String fileName = student.getFile().getOriginalFilename();
        InputStream inputStream = null;
        try {


            inputStream = student.getFile().getInputStream();
            String upload = FileHandleUtil.upload(inputStream,path,fileName);
            String image = ResourceUtils.getURL("classpath:").getPath()+upload;
            student.setImage(image);
            student.setStatus(0);
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
        //计算生日
       /* Date birth= null;
        try {
            birth =new SimpleDateFormat("yyyy-MM-dd").parse(IdCard.getBirAgeSex(student.getCardId()).get("birthday")) ;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(birth);*/
       // student.setBirth(birth);
        studentService.add(student);
        System.out.println(student);
        return "student/studentManager";
    }

    @GetMapping("/student")
    public String toAdd(){

        return "student/add";
    }
    /**
     * 修改学生信息
     */
    @PutMapping("/student")
    public String modify(){

        return "major/add";
    }

    /**
     * 搜索学生信息
     */
    @GetMapping("/search")
    public String search(StudentParam studentParam, Model model){
       /* List<Student> students =  studentService.search(studentParam);
        model.addAttribute("students",students);*/
        return "StudentInfo";
    }

    @GetMapping("/verify")
    public String verify( Model model){
       List<Student> students =  studentService.findByStatus();

       model.addAttribute("student",students);
        return "student/studentVerify";
    }


    @GetMapping("/proVerify")
    public String proVerify( Model model){
        List<Student> students =  studentService.findByStatus();

        model.addAttribute("student",students);
        return "province/verify";
    }

    @PutMapping("/modifyStatus")
    @ResponseBody
    public ResponseResult modifyStatus(int id,int status){
        System.out.println("111");
        ResponseResult result = new ResponseResult();
        studentService.modifyStatus(id,status);
        result.setMessage("审核成功");
        return result;
    }
}
