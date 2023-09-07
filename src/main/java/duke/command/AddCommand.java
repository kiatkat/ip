package duke.command;

import duke.SaveToFileException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.task.Task;

public class AddCommand extends Command {
    private Task taskToAdd;
    public AddCommand(Task task) {
        this.taskToAdd = task;
    }
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws SaveToFileException {
        ui.displayMessage(tasks.add(taskToAdd));
        storage.save(tasks);
    }
}
