package br.senai.sc.ti20131n.pw.gpe.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.senai.sc.ti20131n.pw.gpe.dao.CanalDao;
import br.senai.sc.ti20131n.pw.gpe.entity.Canal;

@FacesConverter(forClass=Canal.class)
public class CanalConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent uiComponent, String value) {
		Long id = Long.parseLong(value);
		CanalDao dao = new CanalDao();
		return dao.buscarPorId(id);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent uiComponent, Object value) {
		Canal canal = (Canal) value;
		return canal.getId().toString();
	}

}
