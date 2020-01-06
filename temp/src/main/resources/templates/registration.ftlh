<#import "parts/common.ftlh" as c>

<@c.page>
${message?ifExists}
<form action="/registration" method="post">
    <div class="form-group">
        <label class="col-sm-2 col-form-label">Project</label>
        <div class="col-sm-5">
        <input class="form-control" type="text" name="project" />
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 col-form-label">Task Name</label>
        <div class="col-sm-5">
            <input class="form-control" type="text" name="name" />
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 col-form-label">Task Description </label>
        <div class="col-sm-5">
        <input class="form-control" type="text" name="description" />
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 col-form-label">Date begin </label>
        <div class="col-sm-5">
            <input class="form-control" type="date" name="datebegin" />
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 col-form-label">Date end </label>
        <div class="col-sm-5">
            <input class="form-control" type="date" name="dateend" />
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 col-form-label">Task status</label>
        <div class="col-sm-5">
            <input class="form-control" type="text" name="status" />
        </div>
    </div>
    <label class="col-sm-2 col-form-label">Add new Task</label>
    <div class="col-sm-2"><button type="submit" class="btn btn-primary">Create</button></div>
</form>
</@c.page>