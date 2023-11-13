package gg.jte.generated.ondemand.courses;
import exercise.dto.courses.CoursePage;
public final class JtecourseGenerated {
	public static final String JTE_NAME = "courses/course.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,16,16,16,16,17,17,17,21};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page) {
		jteOutput.writeContent("\n<html lang=\"en\">\n    <head>\n        <meta charset=\"utf-8\" />\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\n              rel=\"stylesheet\"\n              integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\n              crossorigin=\"anonymous\">\n        <title>Hello Hexlet!</title>\n    </head>\n    <body>\n        <div class=\"mx-auto p-4 py-md-5\">\n            <main>\n                <h2>");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(page.getCourse().getName());
		jteOutput.writeContent("</h2>\n                <div>$");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(page.getCourse().getDescription());
		jteOutput.writeContent("</div>\n            </main>\n        </div>\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
