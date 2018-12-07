package com.revature.trms.service;

import com.revature.trms.dao.TuitionFormData;
import com.revature.trms.domain.TuitionForm;

public class TuitionRequestService extends TuitionFormData {

	public void submitTuitionRequest(TuitionForm form) {
		TuitionFormData data = new TuitionFormData();
		data.submitRequest(form);
	}
}
