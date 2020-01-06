package com.iteco.temp.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
//если названия колонок совпадают с полями то можно не задавать
public class Task {
    //задаем поля задачи
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@Column(name = "project")
    private String project;

    //@Column(name = "idtask")
    private String idtask; // = UUID.randomUUID().toString(); //автоматически будет формироваться taskId в конструкторе

    //@Column(name = "name")
    private String name;

    //@Column(name = "description")
    private String description;

    //@Column(name = "datebegin")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datebegin;

    //@Column(name = "dateend")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateend;

    //@Column(name = "status")
    private String status;

    public Task() {
        this.idtask = UUID.randomUUID().toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getIdtask() {
        return idtask;
    }

    public void setIdtask(String idtask) {
        this.idtask = idtask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatebegin() {
        return datebegin;
    }

    public void setDatebegin(Date datebegin) {
        this.datebegin = datebegin;
    }

    public Date getDateend() {
        return dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
