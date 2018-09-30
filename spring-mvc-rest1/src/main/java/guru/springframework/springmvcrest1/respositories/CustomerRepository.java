package guru.springframework.springmvcrest1.respositories;

import guru.springframework.springmvcrest1.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
