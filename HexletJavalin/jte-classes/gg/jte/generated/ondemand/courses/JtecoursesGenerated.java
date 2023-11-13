package gg.jte.generated.ondemand.courses;
import exercise.dto.courses.CoursesPage;
public final class JtecoursesGenerated {
	public static final String JTE_NAME = "courses/courses.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,23,41,42,43,44,44,47,47,47,50,50,50,50,50,50,50,50,50,50,53,53,58};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\n          rel=\"stylesheet\"\n          integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\n          crossorigin=\"anonymous\">\n    <title>Hello Hexlet!</title>\n</head>\n    <body>\n\n        <div class=\"mx-auto p-4 py-md-5\">\n            <main>\n                <h1>Курсы</h1>\n                <table class=\"table table-striped\">\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n                        ");
		for (var course : page.getCourses()) {
			jteOutput.writeContent("\n                            <tr>\n                                <td>\n                                    ");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(course.getId());
			jteOutput.writeContent("\n                                </td>\n                                <td>\n                                    <a href=\"/courses/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(course.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\">");
			jteOutput.setContext("a", null);
			jteOutput.writeUserContent(course.getName());
			jteOutput.writeContent(" ");
			jteOutput.setContext("a", null);
			jteOutput.writeUserContent(course.getDescription());
			jteOutput.writeContent("</a>\n                                </td>\n                            </tr>\n                        ");
		}
		jteOutput.writeContent("\n                </table>\n            </main>\n        </div>\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
