package org.sid.metier;

import java.util.List;

import org.sid.entities.Historique;

public interface IHistoriqueMetier {
public List <Historique> getall();
public void add(Historique h);
}
