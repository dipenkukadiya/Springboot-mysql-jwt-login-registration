package com.example.Coder.Service;

import java.util.List;


import com.example.Coder.DTO.TodolistDTO;

import com.example.Coder.Request.TodolistRequest;

public interface TodolistService {
    List<TodolistDTO> getAllTodolistByWIdndBId(Long workspace_id,Long board_id);

    TodolistDTO getTodolistByid(Long workspace_id, Long board_id,Long todolist_id);

    void addTodolist(Long workspace_id,Long board_id, TodolistRequest todolistRequest);

    void updateTodolist(Long workspace_id, Long board_id,Long todolist_id, TodolistRequest todolistRequest);

    void removeTodolist(Long workspace_id, Long board_id ,Long todolist_id);

    void toggleTodolistIsArchive(Long workspace_id, Long board_id ,Long todolist_id);

    
    
}