public class RemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        if (slot != null) {
            slot.execute();
        }
    }
}
