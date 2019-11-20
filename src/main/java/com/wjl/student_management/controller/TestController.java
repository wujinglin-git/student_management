package com.wjl.student_management.controller;

import com.wjl.student_management.common.util.ResponseResult;
import com.wjl.student_management.utils.FileHandleUtil;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: wugege
 * @Date: 2019/11/2 8:56
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Controller
public class TestController {
    @PostMapping("/upload")
    @ResponseBody
    public ResponseResult upload(MultipartFile file){
        ResponseResult result = new ResponseResult();
        String path = "image/";
    String fileName = file.getOriginalFilename();
        InputStream inputStream = null;
        try {

            inputStream = file.getInputStream();
            FileHandleUtil fileHandleUtil = new FileHandleUtil();
            String upload = FileHandleUtil.upload(inputStream,path,fileName);
            result.setData(ResourceUtils.getURL("classpath:").getPath()+upload);


        } catch (IOException e) {
            e.printStackTrace();
            result.setData("error");
        }
        return result;
    }
}
