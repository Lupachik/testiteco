package com.home.testiteco.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;


@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String project;

    private String idTask;

    private String name;

    private String description;

    private String status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datebegin;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateend;

    public Task() {
        this.idTask = UUID.randomUUID().toString();
    }
}
