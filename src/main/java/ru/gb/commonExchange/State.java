package ru.gb.commonExchange;

public enum State {
    IDLE,
    COMMAND_LENGTH, COMMAND, COMMAND_HANDLE,
    STRING_LENGTH, STRING,
    NAME_LENGTH, NAME, FILE_LENGTH, FILE
}