package com.byteslounge.spring.tx.user;

import java.util.List;

import com.byteslounge.spring.tx.model.Historique;

public interface IHistoriqueMetier {
public List <Historique> getall();
public void add(Historique h);
}
