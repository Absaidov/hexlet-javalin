@import exercise.dto.courses.CoursesPage
@param CoursesPage page

<%--<html>--%>
<%--    <head>--%>
<%--        <title>Хекслет</title>--%>
<%--    </head>--%>
<%--    <body>--%>
<%--        <h1>HEADER</h1>--%>
<%--        @if(page.getCourses().isEmpty())--%>
<%--            <p>Пока не добавлено ни одного курса</p>--%>
<%--        @else--%>
<%--            @for(var course : page.getCourses())--%>
<%--                <div>--%>
<%--                    <h2><a href="/courses/${course.getId()}">${course.getName()}</a></h2>--%>
<%--                    <p>${course.getDescription()}</p>--%>
<%--                </div>--%>
<%--            @endfor--%>
<%--        @endif--%>
<%--    </body>--%>
<%--</html>--%>

<%--@import exercise.dto.courses.CoursesPage--%>
<%--@param CoursesPage page--%>

<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
          crossorigin="anonymous">
    <title>Hello Hexlet!</title>
</head>
    <body>

        <div class="mx-auto p-4 py-md-5">
            <main>
                <h1>Курсы</h1>
                <table class="table table-striped">
<%--                    @if(page.getCourses().isEmpty())--%>
<%--                        <p>Пока не добавлено ни одного курса</p>--%>
<%--                    @else--%>
                        @for(var course : page.getCourses())
                            <tr>
                                <td>
                                    ${course.getId()}
                                </td>
                                <td>
                                    <a href="/courses/${course.getId()}">${course.getName()} ${course.getDescription()}</a>
                                </td>
                            </tr>
                        @endfor
                </table>
            </main>
        </div>
    </body>
</html>