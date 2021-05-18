package com.complexivo.servidesk.repository;

import com.complexivo.servidesk.models.servicio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface servicioRepository extends JpaRepository<servicio , Long>, JpaSpecificationExecutor<servicio>  {
    servicio findByCodServicio(Long codServicio);    
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE servicio set cod_prioridad =?1  where cod_servicio =?2 ")
    void updateServicePrioridad(Long cod_prioridad, Long cod_servicio);
}
