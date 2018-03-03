package org.sid.metier;

import java.util.List;

import org.sid.entities.Historique;
import org.sid.entities.Reservation;

public interface IHistoriqueMetier {
public List <Historique> getall();
public void add(Historique h);
public List<Historique> getall(long id);
}
