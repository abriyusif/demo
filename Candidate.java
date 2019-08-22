package com.example.demo.candidature.candidates.model;

public class Candidate {
   private Long pk_id;
   private  Long user_id;
    private String position_id;
    private String name;
    private  String  position;
   private String description;

    public Candidate(int i, int i1, String c1, String abri, String chair_person, String candidate) {
    }

    public Candidate(Long pk_id, Long user_id, String position_id, String name, String position, String description) {
        this.pk_id = pk_id;
        this.user_id = user_id;
        this.position_id = position_id;
        this.name = name;
        this.position = position;
        this.description = description;
    }

    public Long getPk_id() {
        return pk_id;
    }

    public void setPk_id(Long pk_id) {
        this.pk_id = pk_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getPosition_id() {
        return position_id;
    }

    public void setPosition_id(String position_id) {
        this.position_id = position_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
