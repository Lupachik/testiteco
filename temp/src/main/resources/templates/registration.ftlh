<#import "parts/common.ftlh" as c>

<@c.page>
${message?ifExists}
<form action="/registration" method="post">
    <div class="form-group">
        <label for="project" class="col-sm-2 col-form-label">Project</label>
        <div class="col-sm-5">
            <select class="form-control" type="text" name="project" id="project">
                <option>TEST PROJECT</option>
                <option>DEMO PROJECT</option>
                <option>WORK PROJECT</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="name" class="col-sm-2 col-form-label">Task Name</label>
        <div class="col-sm-5">
            <input class="form-control" type="text" name="name" id="name"/>
        </div>
    </div>
    <div class="form-group">
        <label for="description" class="col-sm-2 col-form-label">Task Description </label>
        <div class="col-sm-5">
        <input class="form-control" type="text" name="description" id="description"/>
        </div>
    </div>
    <div class="form-group">
        <label for="datebegin" class="col-sm-2 col-form-label">Date begin </label>
        <div class="col-sm-5">
            <input class="form-control" type="date" name="datebegin" id="datebegin"/>
        </div>
    </div>
    <div class="form-group">
        <label for="dateend" class="col-sm-2 col-form-label">Date end </label>
        <div class="col-sm-5">
            <input class="form-control" type="date" name="dateend" id="dateend"/>
        </div>
    </div>
    <div class="form-group">
        <label for="status" class="col-sm-2 col-form-label">Task status</label>
        <div class="col-sm-5">
            <select class="form-control" type="text" name="status" id="status">
                <option>Not started</option>
                <option>Started</option>
                <option>Closed</option>
            </select>
        </div>
    </div>
    <label class="col-sm-2 col-form-label">Add new Task</label>
    <div class="col-sm-2"><button type="submit" class="btn btn-primary">Create</button></div>
</form>
</@c.page>