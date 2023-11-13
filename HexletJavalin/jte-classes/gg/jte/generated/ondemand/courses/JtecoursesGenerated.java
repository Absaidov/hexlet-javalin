package gg.jte.generated.ondemand.courses;
import exercise.dto.courses.CoursesPage;
public final class JtecoursesGenerated {
	public static final String JTE_NAME = "courses/courses.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,9,9,9,11,11,12,12,14,14,14,14,14,14,14,15,15,15,17,17,18,18,20};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n<html>\n    <head>\n        <title>Хекслет</title>\n    </head>\n    <body>\n        <h1>HEADER</h1>\n        ");
		if (page.getCourses().isEmpty()) {
			jteOutput.writeContent("\n            <p>Пока не добавлено ни одного курса</p>\n        ");
		} else {
			jteOutput.writeContent("\n            ");
			for (var course : page.getCourses()) {
				jteOutput.writeContent("\n                <div>\n                    <h2><a href=\"/courses/");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(course.getId());
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent(course.getName());
				jteOutput.writeContent("</a></h2>\n                    <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(course.getDescription());
				jteOutput.writeContent("</p>\n                </div>\n            ");
			}
			jteOutput.writeContent("\n        ");
		}
		jteOutput.writeContent("\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}