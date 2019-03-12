package cg.orionwambert.jhipsterexample.repository;

import cg.orionwambert.jhipsterexample.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
