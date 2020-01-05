<#import "parts/common.ftlh" as c>

<@c.page>
    Task editor
    <form action="/task" method="post">
        <input type="text" name="name" value="${task.name}">
        <input type="text" name="description" value="${task.description}">
        <input type="hidden" value="${task.id}" name="taskId">
        <button type="submit">Save</button>
    </form>
</@c.page>