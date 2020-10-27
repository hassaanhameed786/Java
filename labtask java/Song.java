package com.company;
public class Song



{
    private String title, artist;
    private  int length;

    //Post: a Song object has been created
    //Test the program on that
    //Yar Ko Ham Ne Ja-Bja Dekha by Abida Parveen (length 8min)
    //Allah ho Allah ho by Nusrat Fateh Ali Khan (length 5min)
    //

    public Song(String t, String a, int l)

    {

        title = t;        // checking for valid arguments
        artist = a;          // is done later in this lab
        length = l;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLength(int length) {
        this.length = length;
    }
    //Post: this object's title has been returned

    public String getTitle() {
        return title;
    }


    //Post: this object's artist has been returned

    public String getArtist() {
        return artist;
    }


    //Post: this object's length has been returned
    // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    //for (int i = 0; i < cars.length; i++) {
    //  System.out.println(cars[i]);

    public int getLength() {
        return length;
    }

    String [] Songs ={"Bin tere by atif , Hello by adele ,Allah ho Allah ho by NFAK, ASh lost  ,Yar Ko Ham Ne Ja-Bja Dekha by Abida Parveen"};

}



