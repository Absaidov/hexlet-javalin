package exercise;

import io.javalin.Javalin;
import java.util.List;
import io.javalin.http.NotFoundResponse;
import exercise.model.Course;
import exercise.dto.courses.CoursePage;
import exercise.dto.courses.CoursesPage;
import java.util.Collections;

public final class App {

    // Каждый пользователь представлен объектом класса User
    private static final List<Course> COURSES = Data.getCourses();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Long.class).get();
            Course course = COURSES.stream()
                    .filter(u -> id.equals(u.getId()))
                    .findFirst()
                    .orElse(null);

            if (course == null) {
                throw new NotFoundResponse("User not found");
            }

            var page = new CoursePage(course);
            ctx.render("courses/course.jte", Collections.singletonMap("page", page));
        });

        app.get("/courses", ctx -> {
            var page = new CoursesPage(COURSES);
            ctx.render("courses/courses.jte", Collections.singletonMap("page", page));

        });

        app.get("/users", ctx -> {
            ctx.render("layout/page.jte");
        });
        // END
        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}