package com.adlafrica.inteladata.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefHandler {
	SharedPreferences pref;
	SharedPreferences.Editor prefEditor;
	Context _context;

	// shared pref mode
	int PRIVATE_MODE = 0;

	// Shared preferences file name
	private static final String PREF_NAME = "tPrefs";

	private static final String CC_CODE = "cc_Code";

	private static final String POLICY_NUMBER = "policy_number";

	private static final String INSURER = "insurer_name";

	public PrefHandler(Context _context) {
		this._context = _context;
		this.pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
		this.prefEditor = pref.edit();
	}

	public void setClientCode(String cc_code){
		prefEditor.putString(CC_CODE, cc_code);
		prefEditor.commit();
	}

	public String getClientCode(){
		return pref.getString(CC_CODE, "");
	}

	public void setPolicyNumber(String policy_no){
		prefEditor.putString(POLICY_NUMBER, policy_no);
		prefEditor.commit();
	}

	public String gePolicyNumber(){
		return pref.getString(POLICY_NUMBER, "");
	}

	public void setInsurer(String insurer){
		prefEditor.putString(INSURER, insurer);
		prefEditor.commit();
	}

	public String getInsurer(){
		return pref.getString(INSURER, "");
	}

}