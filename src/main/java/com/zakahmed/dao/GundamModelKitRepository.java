package com.zakahmed.dao;

import com.zakahmed.domain.GundamModelKit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by zahmed on 9/24/17.
 */
@Repository
public interface GundamModelKitRepository extends JpaRepository<GundamModelKit, Long> {
}
