package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import demo.domain.Team;

@RestResource(path="allteams", rel="eachteam")
//@Repository
public interface TeamRepository extends CrudRepository<Team,Long>{

}
