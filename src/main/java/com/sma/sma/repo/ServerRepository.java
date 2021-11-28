package com.sma.sma.repo;

import com.sma.sma.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server,Long> {

    Server findByIpAddress(String ipAddress);

}
