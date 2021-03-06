package cainarong.snru.ac.th.emercall.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import cainarong.snru.ac.th.emercall.R;
import cainarong.snru.ac.th.emercall.utility.HopitaAdpter;
import cainarong.snru.ac.th.emercall.utility.HopitaAdpter;

/**
 * Created by Admin on 20/2/2561.
 */

public class MainFragment extends Fragment{


//    Explicit
    protected String tag = "MyTagV1";


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create ListView
        ListView listView = getView().findViewById(R.id.listViewHopotal);

        int[] ints = new int[]{R.drawable.stationa1, R.drawable.station2,
                R.drawable.station3, R.drawable.station4, R.drawable.stationa1, R.drawable.station2,
                R.drawable.station3, R.drawable.station4};

        String[] titleStrings = new String[]{"Hospital 1","Hospital 2"
                ,"Hospital 3","Hospital 4","Hospital 5","Hospital 6","Hospital 7","Hospital 8" };
        String[] phoneStrings = new String[]{"1111", "1112", "1113", "1114", "1115", "1116", "1117", "1118" };

        HopitaAdpter hopitaAdpter = new HopitaAdpter(getActivity(), ints, titleStrings, phoneStrings);
        listView.setAdapter(hopitaAdpter);


//        Main Method

        //        For Station 1
        ImageView station1ImageView = getView().findViewById(R.id.imageViewStation1);
        station1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(tag, "You Click Image Station1");
                callstation("1111");


            }
        });

        TextView station1TextView = getView().findViewById(R.id.textViewStation1);
        station1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag,"Click Text " + getString(R.string.station1));
                callstation("1111");
            }
        });


        //        For Station 2
            ImageView station2ImageView = getView().findViewById(R.id.imageViewStation2);
            station2ImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d(tag,"You click Image Station");
                    callstation("2222");
                }
            });
            TextView station2TextView = getView().findViewById(R.id.textViewStation2);
            station2TextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d(tag,"Click Text " + getString(R.string.station2));
                    callstation("2222");
                }
            });

        //        For Station 3
            ImageView station3ImageView = getView().findViewById(R.id.imageViewStation3);
            station3ImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d(tag,"You click Image Station");
                    callstation("3333");
                }
            });
            TextView station3TextView = getView().findViewById(R.id.textViewStation3);
            station3TextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d(tag,"Click Text" + getString(R.string.station3));
                    callstation("3333");
                }
            });


        //        For Station 4
        ImageView station4ImageView = getView().findViewById(R.id.imageViewStation4);
        station4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag,"You click Image Station");
                callstation("4444");
            }
        });
        TextView station4TextView = getView().findViewById(R.id.textViewStation4);
        station4TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag,"click Text" + getString(R.string.station4));
                callstation("4444");
            }
        });
    }//    Main Method


    public void callstation(String numberCall) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:=" + numberCall ));
        startActivity(intent);
    }//    callStation

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police, container, false);
        return view;
    }
}   //Main Clase
