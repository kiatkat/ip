public class UnmarkCommand extends Command {
    private Integer index;
    public UnmarkCommand(Integer index) {
        this.index = index;
    }
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.displayMessage(tasks.unmark(index));
        storage.save(tasks);
    }
}