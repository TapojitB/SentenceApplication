package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import demo.domain.Player;

//@RestResource(path="allplayers", rel="eachplayer")
@RepositoryRestResource
//@Repository
public interface PlayerRepository extends CrudRepository<Player,Long>{

}
