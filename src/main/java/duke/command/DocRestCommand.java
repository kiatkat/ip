package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class DocRestCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.displayMessage(tasks.docRest());
    }
}