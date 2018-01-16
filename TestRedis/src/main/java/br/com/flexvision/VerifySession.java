package br.com.flexvision;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class VerifySession implements PhaseListener, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9103108658461420937L;

	@Override
	public void afterPhase(PhaseEvent event) {

	}

	@Override
	public void beforePhase(PhaseEvent event) {
		FacesContext context = event.getFacesContext();
		HttpServletRequest request = ((HttpServletRequest) context.getExternalContext().getRequest());
        HttpSession session = request.getSession();
        
        session.setAttribute("com.sun.faces.renderkit.ServerSideStateHelper.LogicalViewMap",
        session.getAttribute("com.sun.faces.renderkit.ServerSideStateHelper.LogicalViewMap"));
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RENDER_RESPONSE;
	}
	
}