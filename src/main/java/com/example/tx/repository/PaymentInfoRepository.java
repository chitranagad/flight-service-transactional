package com.example.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tx.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Long> {
}
