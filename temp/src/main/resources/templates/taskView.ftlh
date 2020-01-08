<#import "parts/common.ftlh" as c>

<@c.page>
    <div class="col-sm-5"><h3>Task view</h3></div>
    <form action="/task" method="post">
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Project</label>
            <div class="col-sm-5">
                <span class="input-group-text">${task.project}</span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Task Name</label>
            <div class="col-sm-5">
                <span class="input-group-text">${task.name}</span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Task Description </label>
            <div class="col-sm-5">
                <span class="input-group-text">${task.description}</span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Date begin</label>
            <div class="col-sm-5">
                <span class="input-group-text">${task.datebegin}</span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Date end</label>
            <div class="col-sm-5">
                <span class="input-group-text">${task.dateend}</span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 col-form-label">Status</label>
            <div class="col-sm-5">
                <span class="input-group-text">${task.status}</span>
            </div>
        </div>
        <input type="hidden" value="${task.id}" name="taskId">
    </form>
</@c.page>