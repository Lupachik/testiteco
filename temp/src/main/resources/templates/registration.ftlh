<#import "parts/common.ftlh" as c>

<@c.page>
Add new Task
${message?ifExists}
<form action="/registration" method="post">
    <div><label>Task Name: <input type="text" name="name" /></label></div>
    <div><label>Task Description: <input type="text" name="description" /></label></div>
    <div><input type="submit" value="Sing in" /></div>
</form>
</@c.page>