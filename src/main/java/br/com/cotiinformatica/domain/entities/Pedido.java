package br.com.cotiinformatica.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.cotiinformatica.domain.enums.StatusPedido;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@NotBlank
	private String cliente;
	
	@NotNull
	private LocalDateTime dataHora;
	
	@NotNull
	private BigDecimal valor;
	
	@NotNull
	private StatusPedido status;
	
}
