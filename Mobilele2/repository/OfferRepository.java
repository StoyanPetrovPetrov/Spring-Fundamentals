package com.example.mobilele2.repository;

import com.example.mobilele2.model.entity.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OfferRepository extends
        JpaRepository<OfferEntity, UUID>,
        JpaSpecificationExecutor<OfferEntity> {
}
