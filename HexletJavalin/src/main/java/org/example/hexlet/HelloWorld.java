package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // Название параметров мы выбрали произвольно
        app.get("/users/{id}/post/{postId}", ctx -> {
//        app.get("/courses/{courseId}/lessons/{id}", ctx -> {
            ctx.result("Users ID: " + ctx.pathParam("id") + "\n" +"Post ID: " +  ctx.pathParam("postId"));
        });

        app.start(7070);
    }
}