package br.com.cotiinformatica.components;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import br.com.cotiinformatica.domain.entities.Pedido;
@Component
public class MessageConsumerComponent {
	@Autowired
	private ObjectMapper objectMapper;
	
	@RabbitListener(queues = "pedidos")
	public void receive(@Payload String message) {
		
		try {
			
			var pedido = objectMapper.readValue(message, Pedido.class);
			
			System.out.println("\nPEDIDO OBTIDO COM SUCESSO:");
			System.out.println("\nID.........: " + pedido.getId());
			System.out.println("\nCLIENTE....: " + pedido.getCliente());
			System.out.println("\nDATA/HORA..: " + pedido.getDataHora());
			System.out.println("\nVALOR......: " + pedido.getValor());
			System.out.println("\nSTATUS.....: " + pedido.getStatus());			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


