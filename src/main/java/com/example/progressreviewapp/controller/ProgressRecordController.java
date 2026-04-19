package com.example.progressreviewapp.controller;

import com.example.progressreviewapp.entity.ProgressRecord;
import com.example.progressreviewapp.service.ProgressRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/records")
public class ProgressRecordController {
    private final ProgressRecordService service;

    public ProgressRecordController(ProgressRecordService service) {
        this.service = service;
    }

    // 登録画面表示
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("record", new ProgressRecord());
        return "record-form";
    }

    // 登録処理
    @PostMapping
    public String save(@ModelAttribute ProgressRecord record) {
        service.save(record);
        return "redirect:/records";
    }

    // 一覧表示
    @GetMapping
    public String list(Model model) {
        List<ProgressRecord> records = service.findAll();
        model.addAttribute("records", records);
        return "record-list";
    }

    // 詳細表示
    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        ProgressRecord record = service.findById(id);
        model.addAttribute("record", record);
        return "record-detail";
    }
}
