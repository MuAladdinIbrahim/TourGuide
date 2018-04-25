package com.example.android.tourguide;

public class cafe {
    /** String resource ID for the default translation of the word */
    private int mCafeTypeId;

    /** String resource ID for the Arabic translation of the word */
    private int mCafeNameId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     */
    public cafe(int typeId, int nameId, int imageResourceId) {
        mCafeTypeId = typeId;
        mCafeNameId = nameId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getCafeTypeId() {
        return mCafeTypeId;
    }

    /**
     * Get the string resource ID for the Arabic translation of the word.
     */
    public int getCafeNameId() {
        return mCafeNameId;
    }

    /**
     * Return the image resource ID of the word.
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
