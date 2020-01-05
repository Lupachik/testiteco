<#import "parts/common.ftlh" as c>

<@c.page>
    List of tasks
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <#list tasks as task>
            <tr>
                <th>${task.name}</th>
                <th>${task.description}</th>
                <th><a href="/task/${task.id}">edit</a> </th>
            </tr>
        </#list>
        </tbody>
    </table>
</@c.page>