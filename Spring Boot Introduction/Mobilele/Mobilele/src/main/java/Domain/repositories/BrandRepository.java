package Domain.repositories;

import Domain.Enums.Role;
import Domain.entities.Brand;
import Domain.entities.Model;
import Domain.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,String> {
}


