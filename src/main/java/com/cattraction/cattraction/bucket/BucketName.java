package com.cattraction.cattraction.bucket;

public enum BucketName {

    PROFILE_IMAGE("cattraction-image");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }

}
