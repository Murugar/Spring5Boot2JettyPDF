package com.iqmsoft;

public class Form {
    private long id;
    private String content;
    private String item1;
    private String item2;
    private String svar[];

    public long getId() {
        return id;
    }

    public String[] getSvar() {
        return svar;
    }

    public void setSvar(String[] svar) {
        this.svar = svar;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        System.out.println("from class " +content);
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }
}