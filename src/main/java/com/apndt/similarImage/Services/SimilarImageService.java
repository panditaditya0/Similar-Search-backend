package com.apndt.similarImage.Services;

import com.apndt.similarImage.Model.ImageData;

public interface SimilarImageService {
    boolean uploadImage(ImageData imageData);

    ImageData getProductData(Long productId);

    ImageData updateImageData(ImageData imageDataToUbUpdates);
}
