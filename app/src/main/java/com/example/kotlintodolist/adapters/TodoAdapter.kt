package com.example.kotlintodolist.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintodolist.models.ToDo

class TodoAdapter(
    val todos:ArrayList<ToDo>
): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    /*
    JAVA
    class A extends B{
    public A(int a){
    super(a);
        }
        //..
    }
    Kotlin
    class A (val a:Int):B(a){
    //..
    }
     */
    class TodoViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val li=parent?.context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView=li.inflate(android.R.layout.simple_list_item_1,parent,false)
        return TodoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}