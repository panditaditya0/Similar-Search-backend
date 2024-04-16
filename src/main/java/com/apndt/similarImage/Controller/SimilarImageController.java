package com.apndt.similarImage.Controller;

import com.apndt.similarImage.Model.ImageData;
import com.apndt.similarImage.Services.SimilarImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimilarImageController {
    public SimilarImageService similarImageService;

    public SimilarImageController(SimilarImageService similarImageService) {
        this.similarImageService = similarImageService;
    }

    @PostMapping("/uploadImage")
    public ResponseEntity<String> UploadImage(@RequestBody ImageData imageDataToBeUploaded) {
        if (imageDataToBeUploaded.productId == null) {
            return new ResponseEntity<>("Please enter product Id", HttpStatus.BAD_REQUEST);
        }
        if (similarImageService.uploadImage(imageDataToBeUploaded)) {
            return new ResponseEntity<>("Created successfully", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Already present", HttpStatus.ALREADY_REPORTED);
    }

    @GetMapping("/uploadImage/{productId}")
    public ResponseEntity<ImageData> getImageData(@PathVariable Long productId){
        ImageData image= similarImageService.getProductData(productId);
        if(null == image){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(image, HttpStatus.OK);
    }

    @PutMapping("/uploadImage")
    public ResponseEntity updateImageData(@RequestBody ImageData imageDataToUbUpdates){
        ImageData isUpdated = similarImageService.updateImageData(imageDataToUbUpdates);
        if(isUpdated != null){
            return new ResponseEntity<>(imageDataToUbUpdates, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>("Not updated", HttpStatus.NOT_FOUND);
    }
}
