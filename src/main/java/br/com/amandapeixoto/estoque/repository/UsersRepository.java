package br.com.amandapeixoto.estoque.repository;

import br.com.amandapeixoto.estoque.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
