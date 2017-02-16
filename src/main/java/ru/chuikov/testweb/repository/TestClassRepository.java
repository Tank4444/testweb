package ru.chuikov.testweb.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.chuikov.testweb.entity.TestClass;

public interface TestClassRepository extends JpaRepository<TestClass,Long>{
}
