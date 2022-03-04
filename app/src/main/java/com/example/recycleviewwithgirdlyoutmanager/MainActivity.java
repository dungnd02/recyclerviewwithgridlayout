package com.example.recycleviewwithgirdlyoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView rcvUser;
private  UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser= findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        rcvUser.setLayoutManager(gridLayoutManager);

        userAdapter.setData(getlistUser());
        rcvUser.setAdapter(userAdapter);

    }

    private List<User> getlistUser() {
        List<User> list  = new ArrayList<>();
        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"User name 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"User name 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"User name 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"User name 4"));
        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"User name 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"User name 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"User name 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"User name 4"));
        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"User name 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"User name 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"User name 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"User name 4"));
        return  list;
    }
}