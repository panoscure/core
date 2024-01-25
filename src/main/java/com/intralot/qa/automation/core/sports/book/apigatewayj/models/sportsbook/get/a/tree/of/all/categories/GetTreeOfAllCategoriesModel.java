package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.a.tree.of.all.categories;

public class GetTreeOfAllCategoriesModel {
    private String path;

    private String name;

    private String id;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClassPojo [path = " + path + ", name = " + name + ", id = " + id + "]";
    }
}