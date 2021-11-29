package com.headfirst.design.sawgger.controller;

import com.headfirst.design.sawgger.model.Table;
import com.headfirst.design.sawgger.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author LiuCan
 * @date 2021/11/29 9:39
 * @description WordController
 */
@RestController
@RequestMapping("/word")
public class WordController {
    @Autowired
    private WordService tableService;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private Integer port;

    /**
     * 将 swagger 文档转换成 html 文档，可通过在网页上右键另存为 xxx.doc 的方式转换为 word 文档
     *
     * @param model
     * @param url   需要转换成 word 文档的资源地址
     * @return
     */
    @Deprecated
    @RequestMapping("/toWord")
    public String getWord(Model model, @RequestParam(value = "url", required = false) String url) {
        List<Table> tables = tableService.tableList(url);
        model.addAttribute("tables", tables);
        return "word";
    }

    /**
     * 将 swagger 文档一键下载为 doc 文档
     *
     * @param url      需要转换成 word 文档的资源地址
     * @param response
     */
    @RequestMapping("/downloadWord")
    public void word(@RequestParam String url, HttpServletResponse response) {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:" + port + "/toWord?url=" + url, String.class);
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        try (BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream())) {
            response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode("toWord.doc", "utf-8"));
            byte[] bytes = forEntity.getBody().getBytes();
            bos.write(bytes, 0, bytes.length);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
