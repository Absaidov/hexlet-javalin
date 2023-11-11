package org.example.hexlet;

import io.javalin.Javalin;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.example.hexlet.model.Course;
import org.example.hexlet.dto.courses.CoursePage;

public class HelloWorld {
    private static final List<Map<String, String>> USERS = Data.getCompanies();
    public static void main(String[] args) throws SQLException {
//        try (var conn = DriverManager.getConnection("jdbc:h2:mem:hexlet")) {
//
//            var sql = "CREATE TABLE courses "
//                    + "(id BIGINT PRIMARY KEY AUTO_INCREMENT, coursename VARCHAR(255), description VARCHAR(255))";
//
//            try (var statement = conn.createStatement()) {
//                statement.execute(sql);
//            }
//            var dao = new CourseDAO(conn);
//            var course = new Course("Hexlet", "not bad course");
//            dao.save(course);
//            System.out.println("DAO.SAVE");
            var app = Javalin.create(config -> {
                config.plugins.enableDevLogging();
            });

            app.get("/courses/{id}", ctx -> {
                var id = ctx.pathParam("id");
            var course = USERS.get(1);
              var page = new CoursePage(course);
//            ctx.render("courses/course.jte", Collections.singletonMap("page", page));
            });

            app.start(7070);

        }

    }
}