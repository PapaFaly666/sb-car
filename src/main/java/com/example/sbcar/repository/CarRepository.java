package com.example.sbcar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.sbcar.model.Car;
import java.util.List;

@RepositoryRestResource(path = "vehicule")
public interface CarRepository extends CrudRepository<Car, Long> {
    /*
     * List<Car> findByBrand(@Param("brand") String brand);
     * 
     * List<Car> findByColor(@Param("color") String color);
     * 
     * List<Car> findByBrandAndColor(String brand, String color);
     */
}
