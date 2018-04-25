package com.example.android.tourguide;

public class ImageAtt {
    /** String resource ID for names of attraction  */
    private int mNameId;

    /** String resource ID for description*/
    private int mDescriptionId;

    /** Image resource ID for the word */
    private int mImageResourceId ;

    private static final int NO_IMAGE_PROVIDED = -1;


    //create new object
    public ImageAtt(int nameId, int descriptionId, int imageResourceId) {
        mNameId = nameId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for name
     */
    public int getNameId() {
        return mNameId;
    }

    /**
     * Get the string resource ID for the description
     */
    public int getDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Return the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
