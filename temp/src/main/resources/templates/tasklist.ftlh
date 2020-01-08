<#import "parts/common.ftlh" as c>

<@c.page>
    List of tasks
    <table class="table table-bordered">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Project</th>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Description</th>
            <th scope="col">View</th>
            <th scope="col">Edit</th>
            <th scope="col">Remove</th>
        </tr>
        </thead>
        <tbody>
        <#list tasks as task>
            <tr>
                <th>${task.id}</th>
                <th>${task.project}</th>
                <th>${task.idtask}</th>
                <th>${task.name}</th>
                <th>${task.description}</th>
                <th><a href="/task/view/${task.id}">View</a> </th>
                <th><a href="/task/${task.id}">Edit</a> </th>
                <th><a href="/task/delete/${task.id}">Remove</a> </th>
            </tr>
        </#list>
        </tbody>
    </table>
    <div><a href="/registration">Create Task</a></div>
</@c.page>