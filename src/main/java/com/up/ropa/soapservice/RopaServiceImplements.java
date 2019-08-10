package com.up.ropa.soapservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.up.ropa.producto.Ropa;
@WebService(endpointInterface="com.up.ropa.soapservice.RopaService")
public class RopaServiceImplements implements RopaService{

	static List<Ropa> ropalist = new ArrayList<>();
	
	@Override
	public Ropa crearRopa(Ropa ropa) {
		ropalist.add(ropa);
		return ropa;
	}

	@Override
	public List<Ropa> obtenerTodaLaRopa() {

		return ropalist;
	}

}
