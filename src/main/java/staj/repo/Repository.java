package staj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import staj.Entity.StajEntity;

import java.util.List;

public interface  Repository extends JpaRepository <StajEntity, String> {
    public List<StajEntity> findByIsim(String isim);
}
