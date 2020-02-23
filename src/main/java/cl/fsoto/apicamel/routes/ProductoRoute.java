package cl.fsoto.apicamel.routes;

import javax.ws.rs.core.MediaType;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import cl.fsoto.apicamel.model.Producto;

/**
 * Clase que genera la API REST Producto utilizando Apache Camel
 * @author fsoto1
 *
 */
@Component
public class ProductoRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		restConfiguration()
			.enableCORS(true)
			.component("servlet")
			.bindingMode(RestBindingMode.json)
			.contextPath("api")
			.apiContextPath("api-doc")
			.port(8080)
			.host("localhost");
		rest("producto/")
			.description("Endpoint de los Productos")
			.consumes(MediaType.APPLICATION_JSON)
			.produces(MediaType.APPLICATION_JSON)
			.get("all")
				.outType(Producto[].class)
				.to("bean:productoService?method=findAll")
			.get("{id}")
				.outType(Producto.class)
				.to("bean:productoService?method=findById(${header.id})")
			.post("save")
				.type(Producto.class)
				.to("bean:productoService?method=save")
				.outType(Producto.class)
			.delete("delete")
				.type(Producto.class)
				.to("bean:productoService?method=delete")
				.outType(Producto.class)
		;
	}

}
