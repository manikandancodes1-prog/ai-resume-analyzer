package com.hrtech.smart_recruit_hub.model;

import java.util.List;

public class ResumeResponse {
    private String candidateName;
    private List<String> skills;
    private int matchPercentage;
    private String summary;

    // Default Constructor (JSON-க்காக அவசியம்)
    public ResumeResponse() {}

    // All Arguments Constructor (இதனைத்தான் ResumeService தேடுகிறது)
    public ResumeResponse(String candidateName, List<String> skills, int matchPercentage, String summary) {
        this.candidateName = candidateName;
        this.skills = skills;
        this.matchPercentage = matchPercentage;
        this.summary = summary;
    }

    // Getters and Setters (டேட்டா வெளியே தெரிய இது அவசியம்)
    public String getCandidateName() { return candidateName; }
    public void setCandidateName(String candidateName) { this.candidateName = candidateName; }

    public List<String> getSkills() { return skills; }
    public void setSkills(List<String> skills) { this.skills = skills; }

    public int getMatchPercentage() { return matchPercentage; }
    public void setMatchPercentage(int matchPercentage) { this.matchPercentage = matchPercentage; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
}