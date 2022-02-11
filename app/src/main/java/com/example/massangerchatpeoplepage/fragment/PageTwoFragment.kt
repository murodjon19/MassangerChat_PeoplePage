package com.example.massangerchatpeoplepage.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.massangerchatpeoplepage.R
import com.example.massangerchatpeoplepage.adapter.PeopleAdapter
import com.example.massangerchatpeoplepage.model.Chat
import com.example.massangerchatpeoplepage.model.Message
import com.example.massangerchatpeoplepage.model.Room


class PageTwoFragment : Fragment() {

    lateinit var recyclerView : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view : View = inflater.inflate(R.layout.fragment_second, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView3)
        recyclerView.setLayoutManager(GridLayoutManager(context,2))

        refreshAdapters(getAllChats())
    }

    private fun refreshAdapters(chats:ArrayList<Chat>) {
        val adapter = context?.let { PeopleAdapter(it, chats) }
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList<Room>()
        stories.add(Room(R.drawable.img19,"",0))


        val chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(stories))

        chats.add(Chat(Message(R.drawable.img20,"Avazov",false,R.drawable.img24)))
        chats.add(Chat(Message(R.drawable.img20,"Maqsit",true,R.drawable.img25)))
        chats.add(Chat(Message(R.drawable.img21,"Jamol",false,R.drawable.img21)))
        chats.add(Chat(Message(R.drawable.img22,"Karim",true,R.drawable.img22)))
        chats.add(Chat(Message(R.drawable.img20,"Leyla",false,R.drawable.img24)))
        chats.add(Chat(Message(R.drawable.img24,"Amanda",true,R.drawable.img24)))
        chats.add(Chat(Message(R.drawable.img25,"Alex",false,R.drawable.img25)))
        chats.add(Chat(Message(R.drawable.img24,"Bahodir",true,R.drawable.img19)))
        chats.add(Chat(Message(R.drawable.img21,"Olim",false,R.drawable.img21)))
        chats.add(Chat(Message(R.drawable.img22,"Zayniddin",true,R.drawable.img22)))
        chats.add(Chat(Message(R.drawable.img24,"Javohir",false,R.drawable.img24)))
        chats.add(Chat(Message(R.drawable.img19,"Umit",true,R.drawable.img20)))
        chats.add(Chat(Message(R.drawable.img22,"Zaynab",false,R.drawable.img22)))
        chats.add(Chat(Message(R.drawable.img20,"Sherali",false,R.drawable.img20)))

        return chats
    }

}