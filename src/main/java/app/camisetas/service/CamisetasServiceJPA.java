package app.camisetas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.camisetas.model.Camiseta;
import app.camisetas.repository.CamisetasRepository;

@Service
public class CamisetasServiceJPA implements ICamisetasService  {

	@Autowired
	public CamisetasRepository camisetasRepo;
	@Override
	public List<Camiseta> getCamisetas() {
		// TODO Auto-generated method stub
		return  (List<Camiseta>) camisetasRepo.findAll();
	}

	@Override
	public Camiseta getCamiseta(int camisetasId) {
		// TODO Auto-generated method stub
		return camisetasRepo.findById(camisetasId).get();
	}

	@Override
	public Camiseta saveCamiseta(Camiseta camiseta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Camiseta camiseta) {
		// TODO Auto-generated method stub
		camisetasRepo.save(camiseta);
	}

	@Override
	public void delete(int camisetaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Camiseta camiseta) {
		// TODO Auto-generated method stub
		
	}

}
