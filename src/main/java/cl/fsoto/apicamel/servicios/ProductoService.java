package cl.fsoto.apicamel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fsoto.apicamel.jpa.ProductoRepository;
import cl.fsoto.apicamel.model.Producto;

/**
 * Clase responsable de la manipulacion de la tabla Producto
 * @author fsoto1
 *
 */
@Service
public class ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	public Iterable<Producto> findAll(){
		return repository.findAll();
	}
	
	public Producto findById(Long id){
		return repository.findById(id).get();
	}
	
	public Producto save(Producto entity){
		return repository.save(entity);
	}
	
	public void delete(Producto entity){
		repository.deleteById(entity.getId());
	}
}
