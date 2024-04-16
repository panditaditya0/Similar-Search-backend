package com.apndt.similarImage.Services.Impl;

import com.apndt.similarImage.Model.ImageData;
import com.apndt.similarImage.Repository.SimilarImageRepo;
import com.apndt.similarImage.Services.SimilarImageService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SimilarImageImpl implements SimilarImageService {
    public SimilarImageRepo similarImageRepo;

    public SimilarImageImpl(SimilarImageRepo similarImageRepo){
        this.similarImageRepo = similarImageRepo;
    }

    @Override
    public boolean uploadImage(ImageData imageData) {
        Optional dataOPt = similarImageRepo.findById(imageData.productId);
        if(!dataOPt.isPresent()){
            similarImageRepo.save(imageData);
            return true;
        }
        return false;
    }

    @Override
    public ImageData getProductData(Long productId) {
        Optional productdata = similarImageRepo.findById(productId);
        if(productdata.isPresent()){
            return (ImageData) productdata.get();
        }
        return null;
    }

    @Override
    public ImageData updateImageData(ImageData imageDataToUbUpdates) {
        Optional op = similarImageRepo.findById(imageDataToUbUpdates.productId);
        if(op.isPresent()){
            ImageData imageData = (ImageData) op.get();
            imageDataToUbUpdates.ab_id = imageData.ab_id;
            imageDataToUbUpdates.productId = imageData.productId;
            return similarImageRepo.save(imageDataToUbUpdates);
        }
        return null;
    }
}
