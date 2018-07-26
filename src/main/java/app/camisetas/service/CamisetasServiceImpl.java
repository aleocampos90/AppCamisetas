package app.camisetas.service;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import app.camisetas.model.Camiseta;


//@Service
public class CamisetasServiceImpl implements ICamisetasService {

	private List<Camiseta> lista = null;

	public CamisetasServiceImpl() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		lista = new LinkedList<Camiseta>();
		// try {

		Camiseta camiseta1 = new Camiseta();
		
	}

	public List<Camiseta> getPeliculas() {
		// TODO Auto-generated method stub
		return lista;
	}

	public Camiseta getCamiseta(int camisetaId) {
		// TODO Auto-generated method stub
		for (Camiseta i : lista) {
			if (i.getId() == camisetaId) {
				return i;
			}
		}

		return null;
	}

	public Camiseta saveCamiseta(Camiseta camiseta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Camiseta camiseta) {
		// TODO Auto-generated method stub
		lista.add(camiseta);
	}

	@Override
	public void delete(int camisetaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Camiseta camiseta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Camiseta> getCamisetas() {
		// TODO Auto-generated method stub
		return null;
	}

}
