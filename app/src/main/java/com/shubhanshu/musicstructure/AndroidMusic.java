package com.shubhanshu.musicstructure;

/**
 * Created by Babu on 07-02-2018.
 */

public class AndroidMusic {
    private String SongName;
    private String SingerName;
    private int ImageResourceId;

   public AndroidMusic(String vSongName, String vSingerName, int imageResourceId)
   {
       SongName = vSongName;
       SingerName = vSingerName;
       ImageResourceId = imageResourceId;
   }
   public String getSongName()
   {
       return SongName;
   }
   public String getSingerName()
   {
       return SingerName;
   }
   public int getImageResourceId(){
       return ImageResourceId;
   }

}
