package com.hrtech.smart_recruit_hub.controller;

import com.hrtech.smart_recruit_hub.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.hrtech.smart_recruit_hub.model.ResumeResponse;

@RestController
@RequestMapping("/api/v1/resumes")
@CrossOrigin(origins = "*")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("/upload")
    public ResponseEntity<?> uploadAndParse(@RequestParam("file") MultipartFile file) {
        try {
            String extractedText = resumeService.parseResume(file);
            
            // AI லாஜிக்கை இங்கே அழைக்கிறோம்
            ResumeResponse aiAnalysis = resumeService.analyzeResume(extractedText);
            
            return ResponseEntity.ok().body(aiAnalysis);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
} // இந்த அடைப்புக்குறி இருப்பதை உறுதி செய்து கொள்ளுங்கள்