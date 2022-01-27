package com.example.DB.RealDB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="News")
public class News {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nid;
    private String title;
    private String desss;

    public News(long i, String bn, String p) {
        this.title = bn;
        setDesc(p);
        this.desss=p;

    }

    public News(String bn,String d) {
        this.title = bn;
        this.desss = d;

    }

    public News() {

    }

    public void setId(long proid) {
        this.nid = proid;
    }

    public long getId() {
        return nid;
    }

    public void setTitle(String pron) {
        this.title = pron;
    }

    public String getTitle() {
        return title;
    }

    public void setDesc(String  pron) {
        this.desss = pron;
    }

    public String  getDesc() {
        return desss;
    }
}
