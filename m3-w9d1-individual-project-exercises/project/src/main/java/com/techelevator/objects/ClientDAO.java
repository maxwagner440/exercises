package com.techelevator.objects;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface ClientDAO {


	public void doCardio();
	public String finishDay();
	public List<Client> getAllClients();
	public Client getClientByUsername(String username);
	public Long getClientId(String username);
	public BigDecimal calculateCaloricNeeds(Long clientId);
	
	//
//	public BigDecimal calculateCaloricNeeds();
//	public List<Integer> getAllConsumedEntries();
//	public List<Integer> getAllNeededEntries();
}
