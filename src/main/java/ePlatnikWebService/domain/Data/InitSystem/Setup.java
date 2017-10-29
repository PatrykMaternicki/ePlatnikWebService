package ePlatnikWebService.domain.Data.InitSystem;

import ePlatnikWebService.domain.Data.InitSystem.ModeSystem.NormalMode;
import ePlatnikWebService.domain.Data.InitSystem.ModeSystem.iSystemMode;

public class Setup {

	private iSystemMode modeSystem = new NormalMode();
	
	public void changeMode(iSystemMode systemMode){
		modeSystem = systemMode;
	}
	public iSystemMode getModeSystem(){
		return modeSystem;
	}
	
	
}
