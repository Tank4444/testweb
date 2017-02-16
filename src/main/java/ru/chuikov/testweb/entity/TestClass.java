package ru.chuikov.testweb.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "testTable")
public class TestClass {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    private long  id;

    @Column(name = "title",nullable = false,length = 50)
    private String title;

    @Column(name = "text",nullable = false)
    private String text;

    @Column(name = "data",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public TestClass() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
