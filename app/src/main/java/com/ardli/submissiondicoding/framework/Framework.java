package com.ardli.submissiondicoding.framework;

import android.os.Parcel;
import android.os.Parcelable;

public class Framework implements Parcelable {
    private int image;
    private String nama;
    private String detail;
    private String bahasa;
    private String jenis;
    private String versi;
    private String situs;


    public String getSitus() {
        return situs;
    }

    public void setSitus(String situs) {
        this.situs = situs;
    }

    public String getVersi() {
        return versi;
    }

    public void setVersi(String versi) {
        this.versi = versi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }


    public Framework() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.image);
        dest.writeString(this.nama);
        dest.writeString(this.detail);
        dest.writeString(this.bahasa);
        dest.writeString(this.jenis);
        dest.writeString(this.versi);
        dest.writeString(this.situs);
    }

    protected Framework(Parcel in) {
        this.image = in.readInt();
        this.nama = in.readString();
        this.detail = in.readString();
        this.bahasa = in.readString();
        this.jenis = in.readString();
        this.versi = in.readString();
        this.situs = in.readString();
    }

    public static final Creator<Framework> CREATOR = new Creator<Framework>() {
        @Override
        public Framework createFromParcel(Parcel source) {
            return new Framework(source);
        }

        @Override
        public Framework[] newArray(int size) {
            return new Framework[size];
        }
    };
}
