package com.map.onetonejpa.repository;

import com.map.onetonejpa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
