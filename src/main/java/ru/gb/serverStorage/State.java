package ru.gb.serverStorage;

public enum State {
    IDLE,
    COMMAND_LENGTH, COMMAND, COMMAND_HANDLE,
    NAME_LENGTH, NAME, FILE_LENGTH, FILE
}