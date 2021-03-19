package eventProc.database;

import eventProc.memberDTO.MemDTO;

public interface DatabaseService {
	public int saveMember(MemDTO dto);
	
	public String loginCheck(String userId);

}
