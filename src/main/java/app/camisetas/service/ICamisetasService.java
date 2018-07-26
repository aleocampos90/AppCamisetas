package app.camisetas.service;

import java.util.List;

import app.camisetas.model.Camiseta;

public interface ICamisetasService {
	
	public List<Camiseta> getCamisetas();
	public Camiseta getCamiseta(int camisetaId);
	public Camiseta saveCamiseta(Camiseta camiseta);
	public void insert(Camiseta camiseta);
	public void delete(int camisetaId);
	public void update(Camiseta camiseta);
}
