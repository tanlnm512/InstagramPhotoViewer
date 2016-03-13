package vn.creative.instagram.photoviewer.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by minhtan512 on 3/13/2016.
 */
public class ImageModel {
    @SerializedName("low_resolution")
    private ImageModel lowRes;

    @SerializedName("thumbnail")
    private ImageModel thumb;

    @SerializedName("standard_resolution")
    private ImageModel standardRes;

    public ImageModel getLowRes() {
        return lowRes;
    }

    public ImageModel getThumb() {
        return thumb;
    }

    public ImageModel getStandardRes() {
        return standardRes;
    }

    @Override
    public String toString() {
        return "ImageModel{" +
                "lowRes=" + lowRes +
                ", thumb=" + thumb +
                ", standardRes=" + standardRes +
                '}';
    }
}
