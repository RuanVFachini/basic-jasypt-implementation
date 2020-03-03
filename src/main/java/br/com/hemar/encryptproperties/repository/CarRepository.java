package br.com.hemar.encryptproperties.repository;

import br.com.hemar.encryptproperties.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
