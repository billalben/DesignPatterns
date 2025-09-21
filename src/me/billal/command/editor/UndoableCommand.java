package me.billal.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
