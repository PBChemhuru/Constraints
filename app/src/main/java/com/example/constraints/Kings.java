package com.example.constraints;


import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class Kings {
    private List<King>list=new ArrayList<>();
    public Kings()
    {
for(String[]arr:data)
{
    list.add(new King(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),arr[3]));
} }

    public List<King>getKings(){
        return list;
    }
    private  static final String[][]data={
            {"Alexander III","1881","1894","As tsesarevich, Alexander began to study the principles of law and administration under Konstantin Pobedonostsev, then a professor of civil law at Moscow State University and later (from 1880) chief procurator of the Holy Synod of the Orthodox Church in Russia."},
            {"Nicholas II","1894","1917",". During his trip through Japan, Nicholas got a large dragon tattooed on his right forearm from Japanese tattoo artist Hori Chyo.[27] His cousin George V also got his own dragon tattoo from Hori in Yokohama years before. It was during his visit to Otsu, that Tsuda Sanzō, one of his escorting policemen, swung at the Tsesarevich’s face with a sabre. Nicholas was left with a 9 centimeter long scar on the right side of his forehead, but his wound was not life-threatening"},
    };
}

