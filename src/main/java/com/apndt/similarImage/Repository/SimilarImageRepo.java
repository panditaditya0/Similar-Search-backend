package com.apndt.similarImage.Repository;

import com.apndt.similarImage.Model.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimilarImageRepo extends JpaRepository<ImageData, Long> {
}
