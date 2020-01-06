<#import "parts/common.ftlh" as c>

<@c.page>
    <div class="col-sm-5"><h3>Task editor</h3></div>
    <form action="/task" method="post">
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Project</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="project" value="${task.project}" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Task Name</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="name" value="${task.name}" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Task Description </label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="description" value="${task.description}" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Date begin</label>
            <div class="col-sm-5">
                <input class="form-control" type="date" name="datebegin" value="${task.datebegin}" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Date end</label>
            <div class="col-sm-5">
                <input class="form-control" type="date" name="dateend" value="${task.dateend}" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Status</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" name="status" value="${task.status}" />
            </div>
        </div>
        <input type="hidden" value="${task.id}" name="taskId">
        <div class="col-sm-2"><button type="submit" class="btn btn-primary">Save</button></div>
    </form>
</@c.page>