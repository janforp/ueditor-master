package com.janita.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Janita on 2017/6/15 0015-下午 2:56
 * 该类是：
 */
@Controller
@RequestMapping(value = "/upload")
public class UploadController {

    @RequestMapping("/index")
    public String toPage() {
        return "upload";
    }
}
