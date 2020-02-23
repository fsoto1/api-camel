package cl.fsoto.apicamel.jpa;

import org.springframework.data.repository.CrudRepository;

import cl.fsoto.apicamel.model.Producto;

/**
 * Interface de JPA para la tabla Producto
 * @author fsoto1
 *
 */
public interface ProductoRepository extends CrudRepository<Producto,Long>{

}
