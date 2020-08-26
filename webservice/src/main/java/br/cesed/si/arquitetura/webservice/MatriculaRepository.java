package br.cesed.si.arquitetura.webservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "matricula", path = "matricula")
public interface MatriculaRepository extends PagingAndSortingRepository<Matricula, Integer> {

}
