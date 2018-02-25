package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.sid.entities.*;

@Embeddable
public class Keyclass implements Serializable{
	
	public Keyclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Adherent == null) ? 0 : Adherent.hashCode());
		result = prime * result + ((Livre == null) ? 0 : Livre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Keyclass other = (Keyclass) obj;
		if (Adherent == null) {
			if (other.Adherent != null)
				return false;
		} else if (!Adherent.equals(other.Adherent))
			return false;
		if (Livre == null) {
			if (other.Livre != null)
				return false;
		} else if (!Livre.equals(other.Livre))
			return false;
		return true;
	}
	@Column(name="fk_adherent")
	private Long Adherent;
	@Column(name="fk_Livre")
	private Long Livre;
	
	

	public Keyclass(Long adherent, Long livre) {
		super();
		Adherent = adherent;
		Livre = livre;
	}

	public Long getIdAdherent() {
		return Adherent;
	}
	public void setIdAdherent(Long idAdherent) {
		this.Adherent = idAdherent;
	}
	public Long getIdLivre() {
		return Livre;
	}
	public void setIdLivre(Long idLivre) {
		this.Livre = idLivre;
	}

}
