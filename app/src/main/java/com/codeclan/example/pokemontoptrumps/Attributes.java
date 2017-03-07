package com.codeclan.example.pokemontoptrumps;

import org.w3c.dom.Attr;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 07/03/2017.
 */

public class Attributes {

    private ArrayList<Integer> attributes;
    Scanner fileReader;

    public Attributes(InputStream file){
        attributes = new ArrayList<Integer>();
        fileReader = new Scanner(file);
        setUpAttributes();
    }

    private void setUpAttributes() {

    }
}
