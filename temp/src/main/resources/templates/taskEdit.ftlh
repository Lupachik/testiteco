<#import "parts/common.ftlh" as c>

<@c.page>
    <div class="col-sm-5"><h3>Task editor</h3></div>
    <form action="/task" method="post">
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Task Name:</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="name" value="${task.name}" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Task Description: </label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="description" value="${task.description}" />
            </div>
        </div>
        <input type="hidden" value="${task.id}" name="taskId">
        <div class="col-sm-2"><button type="submit" class="btn btn-primary">Save</button></div>
    </form>
</@c.page>