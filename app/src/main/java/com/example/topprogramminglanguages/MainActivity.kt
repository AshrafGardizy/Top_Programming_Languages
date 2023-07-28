package com.example.topprogramminglanguages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1- RecyclerView
        var recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        //2- Data
        var list:ArrayList<ProgrammingModels> = ArrayList();
        var p1 = ProgrammingModels(R.drawable.swift,"Swift","Swift is a high-level general-purpose, multi-paradigm, compiled programming language developed by Apple Inc. and the open-source community.")
        var p2 = ProgrammingModels(R.drawable.js,"JavaScript","JavaScript, often abbreviated as JS, is a programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS. As of 2023, 98.7% of websites use JavaScript on the client side for webpage behavior, often incorporating third-party libraries.")
        var p3 = ProgrammingModels(R.drawable.kotlin,"Kotlin","Kotlin is a cross-platform, statically typed, general-purpose high-level programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise.")
        var p4 = ProgrammingModels(R.drawable.python,"Python","Python is a high-level, general-purpose programming language. Its design philosophy emphasizes code readability with the use of significant indentation via the off-side rule. Python is dynamically typed and garbage-collected.")
        var p5 = ProgrammingModels(R.drawable.csharp,"C#","C# is a general-purpose high-level programming language supporting multiple paradigms. C# encompasses static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented, and component-oriented programming disciplines")

        list.add(p1)
        list.add(p2)
        list.add(p3)
        list.add(p4)
        list.add(p5)
        //3- Adapter
        var adapter = ProgrammingAdapter(list)
        recyclerView.adapter = adapter

    }
}