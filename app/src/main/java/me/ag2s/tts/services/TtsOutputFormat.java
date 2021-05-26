package me.ag2s.tts.services;

import org.jetbrains.annotations.NotNull;

public class TtsOutputFormat {
   public String name;
   public String value;
   public int HZ;
   public int BitRate;
   public boolean needDecode=false;
   public TtsOutputFormat(String name,int hz,int bitRate){
       this.name=name;
       this.value=name;
       this.HZ=hz;
       this.BitRate=bitRate;
   }
    public TtsOutputFormat(String name,int hz,int bitRate,boolean needDecode){
       this.name=name;
       this.value=name;
        this.HZ=hz;
        this.BitRate=bitRate;
       this.needDecode=needDecode;
    }

    public void setNeedDecode(boolean needDecode) {
        this.needDecode = needDecode;
    }

    @NotNull
    @Override
    public String toString() {
        return "TtsOutputFormat{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", HZ=" + HZ +
                ", BitRate=" + BitRate +
                ", needDecode=" + needDecode +
                '}';
    }
}
