package com.example.massangerchatpeoplepage.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.massangerchatpeoplepage.R
import com.example.massangerchatpeoplepage.adapter.ChatAdapter
import com.example.massangerchatpeoplepage.model.Chat
import com.example.massangerchatpeoplepage.model.Message
import com.example.massangerchatpeoplepage.model.Room


class PageOneFragment : Fragment() {

    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.fragment_first, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(context,1)

        refreshAdapters(getAllChats())
    }

    private fun refreshAdapters(chats:ArrayList<Chat>) {
        val adapter = context?.let { ChatAdapter(it, chats) }
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList<Room>()
        stories.add(Room(R.drawable.img19,"",0))
        stories.add(Room(R.drawable.img20,"Laziz Avazov",1))
        stories.add(Room(R.drawable.img21,"Amir Avazov",1))
        stories.add(Room(R.drawable.img22,"Said Avazov",1))
        stories.add(Room(R.drawable.img19,"Jamshid Avazov",1))
        stories.add(Room(R.drawable.img24,"Begzod Avazov",1))
        stories.add(Room(R.drawable.img25,"Abdulhay Avazov",1))
        stories.add(Room(R.drawable.img21,"Abdulhay Avazov",1))
        stories.add(Room(R.drawable.img22,"Abdulhay Avazov",1))
        stories.add(Room(R.drawable.img20,"Abdulhay Avazov",1))
        stories.add(Room(R.drawable.img24,"Abdulhay Avazov",1))

        var chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(stories))

        chats.add(Chat(Message(R.drawable.img19,"Murodjon",false,0)))
        chats.add(Chat(Message(R.drawable.img20,"Maqsit",true,0)))
        chats.add(Chat(Message(R.drawable.img21,"Jamol",false,0)))
        chats.add(Chat(Message(R.drawable.img22,"Karim",true,0)))
        chats.add(Chat(Message(R.drawable.img20,"Leyla",false,0)))
        chats.add(Chat(Message(R.drawable.img24,"Amanda",true,0)))
        chats.add(Chat(Message(R.drawable.img25,"Alex",false,0)))
        chats.add(Chat(Message(R.drawable.img19,"Bahodir",true,0)))
        chats.add(Chat(Message(R.drawable.img21,"Olim",false,0)))
        chats.add(Chat(Message(R.drawable.img22,"Zayniddin",true,0)))
        chats.add(Chat(Message(R.drawable.img24,"Javohir",false,0)))
        chats.add(Chat(Message(R.drawable.img25,"Umit",true,0)))
        chats.add(Chat(Message(R.drawable.img22,"Zaynab",false,0)))
        chats.add(Chat(Message(R.drawable.img20,"Sherali",false,0)))

        return chats
    }

}