package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Sample;

public interface ISample extends JpaRepository<Sample,Integer>{

}