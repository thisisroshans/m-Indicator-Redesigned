package com.lilliemountain.bulbul.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.lilliemountain.bulbul.R;
import com.lilliemountain.bulbul.adapter.StationAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link StationFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link StationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StationFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public StationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StationFragment newInstance(String param1, String param2) {
        StationFragment fragment = new StationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    StationAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_station, container, false);
        expListView = view.findViewById(R.id.recyclerView5);
        prepareListData();
        listAdapter = new StationAdapter(getContext(), listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
        return view;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Airoli");
        listDataHeader.add("Ambarnath");
        listDataHeader.add("Ambivli");
        listDataHeader.add("Andheri");
        listDataHeader.add("Asangaon");
        listDataHeader.add("Atgaon");
        listDataHeader.add("Badlapur");
        listDataHeader.add("Baman Dongari");
        listDataHeader.add("Bandra");
        listDataHeader.add("Bhandup");
        listDataHeader.add("Bhayandar");
        listDataHeader.add("Bhivpuri Road");
        listDataHeader.add("Bhiwandi");
        listDataHeader.add("Boisar");
        listDataHeader.add("Borivali");
        listDataHeader.add("Byculla");
        listDataHeader.add("CBD Belapur");
        listDataHeader.add("Charni Road");
        listDataHeader.add("Chembur");

        // Adding child data
        List<String> to = new ArrayList<String>();
        to.add("To Destination");
        to.add("To CSMT");
        to.add("To PANVEL");
        to.add("To CHURCHGATE");
        to.add("To THANE");

        for (int i = 0; i < listDataHeader.size(); i++) {
            listDataChild.put(listDataHeader.get(i),to);

        }
    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
