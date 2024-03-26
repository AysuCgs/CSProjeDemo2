package com.aysu;

import org.json.simple.JSONArray;

public class Main {
    public static void main(String[] args) {

            JSONArray personelList=DosyaOku.oku(
                    "src/main/java/com/aysu/ornek.json");

            MaasBordro.rapor(personelList);


        }
    }
