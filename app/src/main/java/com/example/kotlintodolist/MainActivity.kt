package com.example.kotlintodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlintodolist.adapters.TodoAdapter
import com.example.kotlintodolist.models.ToDo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val todos:ArrayList<ToDo> =ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todos.add(ToDo("First Task",false))

        rvTodos.layoutManager=LinearLayoutManager(this)
        val todoAdapter:TodoAdapter=TodoAdapter()
        rvTodos.adapter=todoAdapter

    }
}