package com.hrtech.smart_recruit_hub.service;

import com.hrtech.smart_recruit_hub.model.ResumeResponse;
import org.apache.tika.Tika;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResumeService {

    private final Tika tika = new Tika();

    public String parseResume(MultipartFile file) throws Exception {
        return tika.parseToString(file.getInputStream());
    }

    public ResumeResponse analyzeResume(String text) {
        List<String> foundSkills = new ArrayList<>();
        String[] technicalSkills = {"Java", "Spring", "SQL", "React", "Python"};
        
        for (String skill : technicalSkills) {
            if (text.toLowerCase().contains(skill.toLowerCase())) {
                foundSkills.add(skill);
            }
        }

        int score = Math.min(foundSkills.size() * 20, 100);

        return new ResumeResponse(
            "Extracted Profile",
            foundSkills,
            score,
            "AI Analysis: Document processed successfully."
        );
    }
}