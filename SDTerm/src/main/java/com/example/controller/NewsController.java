package com.example.controller;


import com.example.DB.RealDB.News;

import com.example.DB.RealDB.Service.NewsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/News")
public class NewsController {
    @Autowired
    private NewsRepo prp;

    @GetMapping(value = "/show") //showall
    public List<News> show() {
        return prp.getAll();
    }

    @GetMapping(value = "/show/{id}")
    public News show(@PathVariable long id) {
        return prp.getByID(id);
    }

    @PostMapping("/add")
    public String insert(@RequestBody News b) {
        prp.add(b);
        return "เพิ่มข่าวเรียบร้อย";
    }

    @DeleteMapping(value = "/del/{id}") //delController
    public String delete(@PathVariable long id) {
        prp.delete(id);
        return "ลบข่าวรหัส " + id + " เรียบร้อย";
    }

    @PostMapping("/edit/{id}")
    public News edit(@RequestBody News c) {
    	News b = prp.getByID(c.getId());
        b.setTitle(c.getTitle());
        b.setDesc(c.getDesc());
        b.setId(c.getId());
        return prp.add(b);
    }

}


