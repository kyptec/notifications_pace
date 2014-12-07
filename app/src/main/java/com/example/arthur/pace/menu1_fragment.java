package com.example.arthur.pace;

import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.jsoup.Jsoup;

import static com.example.arthur.pace.R.layout.my_activity_layout;

/**
 * Created by Arthur on 12/2/14.
 */
public class menu1_fragment extends Fragment{
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

////        super.onCreate(savedInstanceState);
////        getActivity().setContentView(R.layout.my_activity_layout);
////
//        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.my_recycler_view);
//        recyclerView.setVisibility(View.VISIBLE);
//
//        // improve performance if you know that changes in content
//        // do not change the size of the RecyclerView
//        recyclerView.setHasFixedSize(true);
//
//        // use a linear layout manager
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(mLayoutManager);
//
//        // Data set used by the adapter. This data will be displayed.
//        ArrayList<String> myDataset = new ArrayList<String>();
////        for (int i= 0; i < 20; i++){
////            myDataset.add("Event " + i);
////        }
//
//        ////////////////////////////////////////////////////////////////////////
//        ////////////////////////////////////////////////////////////////////////
//
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//
//        try {
//
//            URL url = new URL("http://alphabits.weebly.com/");
//
//            // read text returned by server
//            //  this guy get html code
//            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
//
//            String line = "";
//            String tempLine = "";
//            while ((line = in.readLine()) != null) {
//                if(line.indexOf("blog-title-link") > 0)
//                    tempLine += "Tittle : " + (html2text(line)) + "\n";//System.out.println(html2text(line));
//                if(line.indexOf("date-text") > 0)
//                    tempLine += "Date : " + (html2text(line)) + "\n";//System.out.println(html2text(line));
//                if(line.indexOf("paragraph") > 0) {
//                    tempLine += (html2text(line)) + "\n\n"; //System.out.println(html2text(line));
//                    myDataset.add(tempLine);
//                    tempLine = "";
//                }
//            }
//            in.close();
//
//        }
//        catch (MalformedURLException e) {
//            System.out.println("Malformed URL: " + e.getMessage());
//        }
//        catch (IOException e) {
//            System.out.println("I/O Error: " + e.getMessage());
//        }
//
//        ////////////////////////////////////////////////////////////////////////
//        ////////////////////////////////////////////////////////////////////////
//
//        // Create the adapter
//        RecyclerView.Adapter adapter = new MyAdapter(getActivity(), myDataset);
//        recyclerView.setAdapter(adapter);

        rootview = inflater.inflate(R.layout.menu1_layout, container, false);
        //rootview = inflater.inflate(my_activity_layout, container, false);
        return rootview;
    }
    public String html2text(String html) {
        return Jsoup.parse(html).text();
    }
}
