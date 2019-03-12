package com.example.recyclerviewlanjutan;

public class Model {
    String name;
    int gambar;
    String overview;



    public Model(String name, int gambar, String overview) {
        this.name = name;
        this.gambar = gambar;
        this.overview = overview;
    }

    public int getGambar() {
        return gambar;
    }

    public String getName() { // get data name dalam bentuk stirng
        return name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) { this.overview = overview; }
}
