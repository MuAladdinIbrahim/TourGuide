package com.example.android.tourguide;

public class speak {
    /** String resource ID for the default translation of the word */
    private int mDefaultTranslationId;

    /** String resource ID for the Arabic translation of the word */
    private int mArabicTranslationId;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     */
    public speak(int defaultTranslationId, int ArabicTranslationId, int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mArabicTranslationId = ArabicTranslationId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     */
    public speak(int defaultTranslationId, int ArabicTranslationId, int imageResourceId, int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mArabicTranslationId = ArabicTranslationId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    /**
     * Get the string resource ID for the Arabic translation of the word.
     */
    public int getArabicTranslationId() {
        return mArabicTranslationId;
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

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
