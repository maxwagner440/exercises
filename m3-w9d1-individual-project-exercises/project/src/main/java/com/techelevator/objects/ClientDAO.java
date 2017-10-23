package com.techelevator.objects;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface ClientDAO {

	public void eat(BigDecimal intakeCalories);
	public void doCardio();
	public String finishDay();

	public BigDecimal calculateCaloricNeeds();
	public List<Integer> getAllConsumedEntries();
	public List<Integer> getAllNeededEntries();
	public List<Client> getAllClients();
}
