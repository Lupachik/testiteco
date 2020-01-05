<#import "parts/common.ftlh" as c>

<@c.page>
    <div>
        <span><a href="/task">Task list</a> </span>
    </div>
    <div>
        <form method="post">
            <input type="text" name="name" placeholder="Задача" />
            <input type="text" name="description" placeholder="Описание" />
            <button type="submit">Добавить</button>
        </form>

    <#list tasks as task>
    <div>
        <b>${task.id}</b>
        <b>${task.name}</b>
        <b>${task.description}</b>
    </div>
    <#else>
    No tasks
    </#list>
</@c.page>